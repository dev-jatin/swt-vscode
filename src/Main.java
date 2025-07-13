import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.browser.Browser;
import utils.SendFunction;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);

        shell.setLayout(new FillLayout()); 

        Browser browser = new Browser(shell, SWT.NONE);
        String url = "file:///Users/jatingupta/Documents/leena/build/index.html";

        new SendFunction(browser, "sendQuerry");

        browser.setUrl(url);

        

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
}
