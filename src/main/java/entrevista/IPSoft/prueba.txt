println("Hello Elias, let's start with some exercises.")

// 1 ////////////////////////////////////////////////////////////////////////////////////////
// We need a function to print in one line a space separated sequence like the following:
// The sequence should print until the element defined by the leght input parameter.
// The first element is an optional input parameter, it should be 0 by default.
// The second element is an optional input parameter, it should be 1 by default.
// From the third element onwards, the element is calculated as the sum of the 2 previous elements.

def printLucasSequence(def inSeqLen, def inFirstParam, def inSecondParam) {

}
// Input: 8
// 0 1 1 2 3 5 8 13

// Input: 4, 2, 3
// 2 3 5 8

// 2 ////////////////////////////////////////////////////////////////////////////////////////
// A client webservice request parameter needs to be 10 character long.
// It must contain a customer ID, but this ID is not always 10 characters long.
// So if needed the ID must be pre-pended with 0s.
// Or if the ID is too long, the last 10 characteres should be taken.

// Create a function that takes the customer ID and returns the formatted 10 char long string.
// IN:  Customer ID as string.
// OUT: String with characters long.
def formatIdForRequest(def inId) {

}
// Input: 1234
// 0000001234

// 3 ////////////////////////////////////////////////////////////////////////////////////////
// A client webservice response contains a list of IDs of its customers.
// Valid IDs have the format *****-NNNN with * an uppercase letter and N a number

// Create a function that validates the format of the IDs and returns a map with 2 elements
// IN:  List with IDs as strings.
// OUT: Map with 2 elements:
//      1st element key is "valid" and its value is a list of valids IDs.
//      2nd element key is "invalid" and its value is a list of invalids IDs.
def getValidInvalidMap(def inList) {

}
// println(getValidInvalidMap(testList))
// Input: def idList = ["ABC-1234", "D4F4", "ZXY-0000", "123-ABCD", "65ad", "testing", "RTE-9876"]
// [valid:[ABC-1234, ZXY-0000, RTE-9876], invalid:[D4F4, 123-ABCD, 65ad, testing]]

// 4 ////////////////////////////////////////////////////////////////////////////////////////
// Create a method that:
// prints the valid IDs and its debts only if the debt is greater than or equal to 0 like:
// id and "owns us " amount " millions of dollars."
// if the debt is less than 0, it prints the id and " looks like it's our lender :/ ."
// if a valid ID is not found it prints the id and " might be a ghost customer!"
// IDs debts come as an input map
// IN:  Map of valid and invalid ids return by previous method.
//      Map with IDs as keys and Debt as values.

def getDebtOfIds(def inIdMap, def inDebtMap) {

}
//getDebtOfIds(getValidInvalidMap(testList), debtMap)
/*
Input: def inDebtMap = ["ABC-1234": -45, "ZXY-0000": 45.3]
ABC-1234 looks like it's our lender :/ .
ZXY-0000 owns us 45.3 millions of dollars.
RTE-9876 might be a ghost customer!
*/