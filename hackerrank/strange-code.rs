use std::env;
use std::fs::File;
use std::io::{self, BufRead, Write};

/*
 * Complete the 'strangeCounter' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER t as parameter.
 */

fn strangeCounter(t: i64) -> i64 {
    let shiftedTime: i64 = t + 2;
    let power: u32 = (shiftedTime as f64 / 3_f64).log2() as u32;
    let currentCycle: i64 = 3_i64 * 2_i64.pow(power);
    2 * currentCycle - shiftedTime
}

fn main() {
    let stdin = io::stdin();
    let mut stdin_iterator = stdin.lock().lines();

    let mut fptr = File::create(env::var("OUTPUT_PATH").unwrap()).unwrap();

    let t = stdin_iterator
        .next()
        .unwrap()
        .unwrap()
        .trim()
        .parse::<i64>()
        .unwrap();

    let result = strangeCounter(t);

    writeln!(&mut fptr, "{}", result).ok();
}
