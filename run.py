import os
import subprocess

# Delete old Main.class if it exists
main_class_path = "bin/Main.class"
if os.path.exists(main_class_path):
    print(f"Deleting old {main_class_path}...")
    os.remove(main_class_path)

# Compile Java files
print("Compiling Java...")
compile_cmd = 'javac -cp "lib/swt.jar" -d bin $(find src -name "*.java")'
ret = os.system(compile_cmd)
if ret != 0:
    print("Compilation failed.")
    exit(1)

# Run the Java SWT application
print("Running Java SWT application...")
run_cmd = 'java -XstartOnFirstThread -cp "bin:lib/swt.jar" Main'
os.system(run_cmd)
