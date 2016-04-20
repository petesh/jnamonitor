
all: jna-monitor.dll

CXX=x86_64-w64-mingw32-g++

jna-monitor.dll: monitor.cpp monitor.h
	$(CXX) -o $@ -shared $<
