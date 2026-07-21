package NumberSeries;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
/*
 * Alright—let’s make it **super simple**, no theory.

---

# 🧠 Think like this:

You have a number → **num = 8**

You ask:
👉 “Can anyone divide 8?”

---

# 🔁 Loop meaning:

```java
for (int i = 2; i < num; i++)
```

👉 Means:

> Try dividing 8 by:

```text
2, 3, 4, 5, 6, 7
```

---

# 🔍 Check one by one

### i = 2

```text
8 ÷ 2 = 4 → works ❌
```

👉 Found one divisor → STOP
👉 So 8 is **NOT prime**

---

# 🟢 Now take num = 7

Try:

```text
7 ÷ 2 → no  
7 ÷ 3 → no  
7 ÷ 4 → no  
7 ÷ 5 → no  
7 ÷ 6 → no  
```

👉 Nobody can divide 7
👉 So 7 is **prime ✅**

---

# 🎯 Final simple meaning

👉 Loop is asking:

> “Can any number divide this?”

* If YES → ❌ Not prime
* If NO → ✅ Prime

 */
/*
Outer Loop Iteration:

The outer loop starts at num = 2 and increments up to n. For each value of num, it initiates the inner loop to check its primality.
Inner Loop Execution:

For each value of num, the inner loop runs from 2 up to num - 1.
If num is divisible by any number in this range, isPrime is set to false, and the loop breaks early to avoid unnecessary checks.
Prime Check:

After the inner loop completes (or breaks), if isPrime is still true, it means no divisors were found other than 1 and num itself. Therefore, num is a prime number.
The number is then printed out.
 */