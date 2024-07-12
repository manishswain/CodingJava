def func():
    count = 0
    sum = 0
    minm_grade = 101
    maxm_grade = 0

    while True:
        grade = input()
        if grade == 'Done':
            break
        grade = int(grade)
        if grade < 0 or grade > 100:
            print("Invalid Input")
            break

        count += 1
        sum += grade
        if grade < minm_grade:
            minm_grade = grade
        if grade > maxm_grade:
            maxm_grade = grade
    print("Number of test scores entered", count)
    print("The lowest Score", minm_grade)
    print("The highest score",maxm_grade)
    print("The average score", sum/count)       
if __name__ == "__main__":
    func()