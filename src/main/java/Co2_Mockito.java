public class Co2_Mockito {
    //un obiect fake dar are functii
    //aducem o noua dependinta (o sa am un nou jar)
    //in slide este scris gresit, nu putem avea mock pe acceasi clasa pe care o testam, trebuie clasa in clasa
    //mockuim calculatorul de ex., dar nu pot mockui calculatorul in calculator (mock-uiesc obiectul)
    //de accea trebuie de ex. in clasa Phone mock-uim Calculatorul, pentru ca vreau sa testez doar clasa Phone, nu trebuie sa intru si in Calculator, dar trebuie sa am un mocked calculator ca sa-i iau functia
    //nu poti mockui un void, de accea se poate prezenta ex. mai bune cu boolean
}
