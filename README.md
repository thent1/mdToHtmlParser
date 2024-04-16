## Description

This app converts Markdown syntax into corresponding HTML tags. It recognizes bold, italic and monospaced text, and identifies paragraphs and reformatted sections of text, replacing them with the appropriate tags.

## How to assemble

Make sure you have JDK version 17 (or higher) installed. To begin with, you need to clone this repository using the command:
```
git clone https://github.com/thent1/mdToHtmlParser.git
```


Go to the /src package
```
cd src
```

Compile the project using the following command

```
javac Main.java
```

## How to run

An example of running a program with output to the console

```
java Main <path to file.md>
```

An example of running a program with output to file

```
java Main <path to file.md> --out <output path>
```

Revert commit link: [https://github.com/thent1/mdToHtmlParser/commit/1ac9ecbe11db11ecd0d43e3ee08d78f8ce613e8e](https://github.com/thent1/mdToHtmlParser/commit/1ac9ecbe11db11ecd0d43e3ee08d78f8ce613e8e)
