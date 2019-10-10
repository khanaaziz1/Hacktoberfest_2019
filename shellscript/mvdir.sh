#!/bin/bash

# Usage: ./mvdir.sh file

# Create a directory and move file in directory
# The directory created will same as filename less extension

fullfilename=$1
filename=$(basename "$fullfilename")
dirname=${filename%.*}
mkdir $dirname
mv $1 $dirname
