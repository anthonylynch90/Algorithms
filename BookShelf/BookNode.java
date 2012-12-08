
public class BookNode {
    private Book bookPart;
    private BookNode next;
 
    //--------------------------------------------------------
    //  Creates an empty node.
    //--------------------------------------------------------
    public BookNode()
    {
       next = null;
       bookPart = null;
    }
//  ---------------------------------------------------------
//  Creates a node storing the specified element.
//---------------------------------------------------------
    public BookNode (Book elem)
    {
       next = null;
       bookPart = elem;
    }
    
//---------------------------------------------------------
//  Returns the node that follows this one.
 //---------------------------------------------------------
    public BookNode getNext()
    {
       return next;
    }

//  ---------------------------------------------------------//  Sets the node that follows this one.//---------------------------------------------------------   
    public void setNext (BookNode node)
    {       next = node;    }
    
        
    //---------------------------------------------------------//  Sets the element stored in this node.//---------------------------------------------------------    
    public void setElement (Book elem)    
    {       bookPart = elem;   }

//  ---------------------------------------------------------//  Sets the node that follows this one.//---------------------------------------------------------    public void setNext (LinearNode node)    {       next = node;    } //---------------------------------------------------------//  Returns the element stored in this node.//---------------------------------------------------------    
    public Book getElement()
    {       return bookPart;    }
}
