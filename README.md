# Groovy NullPointerException Handling and Loose Typing

This example demonstrates a common issue in Groovy related to null pointer exceptions and the language's loose typing system.  The `myMethod` function attempts to add two numbers; however, it doesn't explicitly handle situations where one or both inputs might be null.

The `bug.groovy` file shows the problem, while `bugSolution.groovy` offers a corrected version with improved null handling.

## Problem

Groovy's flexible nature can mask potential null pointer exceptions. If either `a` or `b` is null, the addition operation (`a + b`) will throw a `NullPointerException` unless handled carefully.

## Solution

The improved version includes explicit checks for null values and handles them appropriately, preventing unexpected exceptions.