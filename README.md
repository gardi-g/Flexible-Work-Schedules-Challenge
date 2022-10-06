# Flexible-Work-Schedules-Challenge

# Question
 ```sh
*Alice works for a company that allows her to set her own work schedule, subject to the following constraints:

*She must work k continuous shifts

*Each shift must cover at least one of the pre-scheduled tasks

*Her k shifts must cover all n pre-scheduled tasks

*Each pre-scheduled task takes 1 minute to complete

*Your challenge is to figure out how to schedule these shifts in order to maximize the amount of free time she has between them.
```

# Input Format
The first line of input contains two space separated integers, k and n. The next n lines contain the start time of a pre-scheduled task for the next 10 years, in the form:
 ```sh
*DAY HH:MM ampm

where:

*day is an integer between 0 and 3640, inclusive, representing the day of the year

*HH is a 2-digit integer between 01 and 12, inclusive, representing the hour

*MM is a 2-digit integer between 00 and 59, inclusive, representing the minutes past the hour

*ampm is chosen from the set {am, pm}

Note that the jobs will occur within the next 10 years, and all of the jobs will be listed in chronological order.
 ```

# Solution
We needed to use a greedy algorithm to solve this question. At first, inputting the time as a string and converting it into a time integer was the first step. After splitting the days, time and pm|am inside the array, I converted the time into minutes. After that, I found the gaps between each minutes and sorted the array by ascending order. Then, calculated the sum of the largest gaps and printed the solution.
