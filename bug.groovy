```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Handle null input
  }
  // some code that may throw exception 
  return a + b
}

println myMethod(1,2) //3
println myMethod(null, 2) //null
println myMethod(1, null) //null
println myMethod(null, null) //null
```