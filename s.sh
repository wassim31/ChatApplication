#!/bin/bash
find . -type f -name "*.class" -delete

echo "Deleted all .class files in '$1' and its subdirectories."

