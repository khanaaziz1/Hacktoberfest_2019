package main

import "fmt"

            
func reverse(s string) string{
         p:= ""
         r:= len(s) - 1
         for i :=r ; i>=0 ; i-- {
                
                 p = p + string(s[i])  
 
        }
        return string(p)
}
