# Python - kept it dead simple with Euclidean. No recursion cuz stack depth's a joke for big nums sometimes, tho these tests are tiny.
def gcd(a, b):
    while b:
        a, b = b, a % b
    return abs(a)  # just in case someone slips a negative, tho tests don't
