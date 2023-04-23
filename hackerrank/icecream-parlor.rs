use std::env;
use std::fs::File;
use std::io::{self, BufRead, Write};
use std::collections::HashMap;
use std::cmp::{max, min};

/*
 * Complete the 'icecreamParlor' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER m
 *  2. INTEGER_ARRAY arr
 */

fn icecreamParlor(m: i32, arr: &[i32]) -> Vec<i32> {
    let mut encountered = HashMap::<i32, usize>::new();
    let mut result: Vec<i32> = vec![];

    for (i, n) in arr.iter().enumerate() {
        let idx_opt = encountered.get(&(m - *n));
        match idx_opt {
            None => {
                encountered.insert(*n, i);
            }
            Some(idx) => {
                result.push(min(*idx, i) as i32 + 1);
                result.push(max(*idx, i) as i32 + 1);
                break;
            }
        }
    }

    return result;
}

fn main() {
    let stdin = io::stdin();
    let mut stdin_iterator = stdin.lock().lines();

    let mut fptr = File::create(env::var("OUTPUT_PATH").unwrap()).unwrap();

    let t = stdin_iterator.next().unwrap().unwrap().trim().parse::<i32>().unwrap();

    for _ in 0..t {
        let m = stdin_iterator.next().unwrap().unwrap().trim().parse::<i32>().unwrap();

        let n = stdin_iterator.next().unwrap().unwrap().trim().parse::<i32>().unwrap();

        let arr: Vec<i32> = stdin_iterator.next().unwrap().unwrap()
            .trim_end()
            .split(' ')
            .map(|s| s.to_string().parse::<i32>().unwrap())
            .collect();

        let result = icecreamParlor(m, &arr);

        for i in 0..result.len() {
            write!(&mut fptr, "{}", result[i]).ok();

            if i != result.len() - 1 {
                write!(&mut fptr, " ").ok();
            }
        }

        writeln!(&mut fptr).ok();
    }
}
