package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func convertInputToFloat(s string) {

	x, err := strconv.Atoi(s)
	if err != nil {
		fmt.Println("invalid")
	}

}

func main() {
	reader := bufio.NewReader(os.Stdin)
	stringLengthOfArray, _ := reader.ReadString(' ')
	lengthOfArray := convertInputToFloat(stringLengthOfArray)

	fmt.Println(lengthOfArray)
}
