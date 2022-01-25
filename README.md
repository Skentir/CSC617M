# CSC617M

A custom programming language that simulates a music sheet and plays music.

1. Clone this repository and go to its directory.

2. Make a virtual environment using Python. Below are the steps:

- Install virtualenv: `pip install virtualenv`
- Create a virtual environment: `virtualenv venv -p python3`
- Activate the virtual environment (for Mac): `source venv/bin/activate`
- Activate the virtual environment (for Windows): `venv/Scripts/activate`
- NOTE. To deactivate: `deactivate`

3. While virtual environment is activated, install the ANTLR Runtime Environment for Python by running the command: `pip install -r requirements.txt`

4. Run the lexer by using the command: `python main.py`

5. Input the name of the file (without the extension).

6. Run the parse tree using the command: `python .\pygrun.py MyGrammer prog --tree <filename>.sht`

### Unix Setup

1.  Add this to bash profile
    `export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"`
2.  Alias the tool to generate lexer and parser
    `alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'`
3.  Compile
    `antlr4 -Dlanguage=Python3 MyGrammer.g4 -visitor -o dist`
