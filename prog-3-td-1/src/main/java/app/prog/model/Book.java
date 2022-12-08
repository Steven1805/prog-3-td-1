package app.prog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    /*
    TODO-4-a: Note that i use serial type for ID in database. What does serial do ?
    The SERIAL data type stores sequential integers of data type INT, which are automatically assigned by the database server when a new row is inserted.
    TODO-4-b: Should I map it with int ? Fix it if there is a problem

     */
    @Id
    private int id;
    private String title;
    private static Author author;
    private Integer pageNumber;
    private LocalDate releaseDate;

    public boolean hasAuthor() {
        return author != null;
    }

}
