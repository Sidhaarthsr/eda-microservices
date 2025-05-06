import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {

    @Override
    public void getBookAuthor(Author request, StreamObserver<Author> responseObserver) {
        // Example implementation
        Author response = Author.newBuilder()
                .setName("Author Name")
                .setBook("Book Title")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
