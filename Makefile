SRC_DIR = src

SOURCES := $(shell find $(SRC_DIR) -name "*.java")

all:
	@rm -rf build/ TsidTool.jar
	@javac -d build $(SOURCES)
	@jar cvfe TsidTool.jar com.banjohann.Main -C build .
