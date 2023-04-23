use std::env;
use std::fs::File;
use std::io::{self, BufRead, Write};

/*
 * Complete the 'hackerrankInString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fn hackerrankInString(s: &str) -> String {
    let mut hrCharIterator = "hackerrank".chars();
    let mut currHrCharOpt = hrCharIterator.next();

    for c in s.chars() {
        if c == currHrCharOpt.unwrap() {
            currHrCharOpt = hrCharIterator.next();
            if currHrCharOpt.is_none() {
                return String::from("YES");
            }
        }
    }
    
    String::from("NO")
}

fn main() {
    let stdin = io::stdin();
    let mut stdin_iterator = stdin.lock().lines();

    let mut fptr = File::create(env::var("OUTPUT_PATH").unwrap()).unwrap();

    let q = stdin_iterator.next().unwrap().unwrap().trim().parse::<i32>().unwrap();

    for _ in 0..q {
        let s = stdin_iterator.next().unwrap().unwrap();

        let result = hackerrankInString(&s);

        writeln!(&mut fptr, "{}", result).ok();
    }
}
