#! /bin/sh

# this shell script accepts three arguments:
# 1. name of the subfolder in which the file will be created, either "leetcode" or "hackerrank"
# 2. the name of the file with extension that will be created
# 3. string that will be inserted into the file
# after the string is inserted, the file is committed
# and the commit message is the name of the file without extension


# check if the number of arguments is correct
if [ $# -ne 3 ]; then
    echo "Usage: $0 <folder> <filename> <string>"
    exit 1
fi

# check if the first argument is either "leetcode" or "hackerrank"
if [ "$1" != "leetcode" ] && [ "$1" != "hackerrank" ]; then
    echo "The first argument must be either \"leetcode\" or \"hackerrank\""
    exit 1
fi

# create the file
touch "$1/$2"

# insert the string into the file
echo "$3" >> "$1/$2"

file_wo_extension=$(echo "$2" | cut -f 1 -d '.')

# commit the file
git add "$1/$2"
git commit -m "$file_wo_extension"

exit 0