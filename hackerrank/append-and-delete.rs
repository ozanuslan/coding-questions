use std::env;
use std::fs::File;
use std::io::{self, BufRead, Write};

/*
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */

fn appendAndDelete(s: &str, t: &str, k: i32) -> String {
    let mut i = 0;
    while i < s.len() && s.chars().nth(i) == t.chars().nth(i) {
        i += 1;
    }
    
    let deletedCharCount = (s.len() - i) as i32;
    let addedCharCount = (t.len() - i) as i32;
    let totalMoves = deletedCharCount + addedCharCount;

    if totalMoves == k {
        return "Yes".to_string();
    } else if totalMoves > k {
        return "No".to_string();
    }

    let movesLeft = k - totalMoves;
    
    if movesLeft % 2 == 0 {
        return "Yes".to_string();
    }
    
    if (i * 2) as i32 <= movesLeft {
        return "Yes".to_string();
    }
    
    "No".to_string()
}

fn main() {
    let stdin = io::stdin();
    let mut stdin_iterator = stdin.lock().lines();

    let mut fptr = File::create(env::var("OUTPUT_PATH").unwrap()).unwrap();

    let s = stdin_iterator.next().unwrap().unwrap();

    let t = stdin_iterator.next().unwrap().unwrap();

    let k = stdin_iterator.next().unwrap().unwrap().trim().parse::<i32>().unwrap();

    let result = appendAndDelete(&s, &t, k);

    writeln!(&mut fptr, "{}", result).ok();
}
