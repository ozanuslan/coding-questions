#! /bin/sh

# this shell script accepts two arguments:
# 1. the name of the file with extension that will be created
# 2. string that will be inserted into the file
# after the string is inserted, the file is committed
# and the commit message is the name of the file without extension

if [ $# -ne 2 ]
then
    echo "Usage: commit.sh <file_name> <string>"
    exit 1
fi

file_without_extension=$(echo "$1" | cut -f 1 -d '.')

echo $2 >> $1
git add $1
git commit -m $file_without_extension