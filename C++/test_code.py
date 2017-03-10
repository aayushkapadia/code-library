import subprocess

source_files = []
source_files.append("Source/IO/MyScanner.cpp")
source_files.append("Source/Graph/UnionFind.cpp")

test_file = raw_input("Enter file name you want to test : ")

compiler_command = []
compiler_command.append("g++")
compiler_command.extend(source_files)
compiler_command.append(test_file)

subprocess.call(compiler_command)
