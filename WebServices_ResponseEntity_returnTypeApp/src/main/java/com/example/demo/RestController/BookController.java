package com.example.demo.RestController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Book;

@RestController
@RequestMapping("/v1/api/book")
public class BookController {

    /*
     * R.T    : Response Entity
     * Method : GET
     * PATH   : find/{id}
     * Input  : id@pathVariable
     */
    @GetMapping("find/{id}")
    public ResponseEntity<?> getBookDetails(@PathVariable Integer id) {

        // Sample book object
        Book b = new Book(45, "C++", 455.90);
        HttpHeaders headers ;
        

        // If the id is 5, return the book with a custom header
        if (id == 5) {
           headers = new HttpHeaders();
            headers.add("Found", "YES");
            return new ResponseEntity<>(b, headers, HttpStatus.OK);
        } else {
        	headers = new HttpHeaders();
            headers.add("Not", "Found");
            
            return new ResponseEntity<>("Book not found Sorry", headers,HttpStatus.BAD_REQUEST);
        }
    }
    
//--------------------------------------------------------------------------------------------------------------------------------    

    /*
     * R.T    : Response Entity
     * Method : GET
     * PATH   : /info
     * Input  : id@pathVariable
     */
    @GetMapping("/info")
   public Book getInfo() {
    	return new Book(100, "JAVA",45.00); //return type is automatically converted  to response Entity

        
    }
}








































