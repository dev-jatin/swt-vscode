package utils;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class SendFunction extends BrowserFunction {
    private final Browser browser;

    public SendFunction(Browser browser, String name) {
        super(browser, name);
        this.browser = browser;
    }

    @Override
    public Object function(Object[] arguments) {
        if (arguments.length > 0) {
            String userInput = (String) arguments[0];
            System.out.println("React sent: hekltlkesfjkl " + userInput);

            // Simulate sending back a response to React
            simulateStreamingResponse(userInput);
        }
        return null;
    }

    private void simulateStreamingResponse(String input) {
        String response = "Response from Java for input: " + input;

        // Send it back to the React frontend (calls a JS function)
        String js = String.format("window.receiveFromJava('%s');", response.replace("'", "\\'"));
        browser.execute(js);
    }
}
