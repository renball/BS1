
package org.example.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConnectPlayer_QNAME = new QName("http://example.org/", "ConnectPlayer");
    private final static QName _ConnectPlayerResponse_QNAME = new QName("http://example.org/", "ConnectPlayerResponse");
    private final static QName _GetCur_QNAME = new QName("http://example.org/", "getCur");
    private final static QName _GetCurResponse_QNAME = new QName("http://example.org/", "getCurResponse");
    private final static QName _GetLastMove_QNAME = new QName("http://example.org/", "getLastMove");
    private final static QName _GetLastMoveResponse_QNAME = new QName("http://example.org/", "getLastMoveResponse");
    private final static QName _GetLastPlayerMove_QNAME = new QName("http://example.org/", "getLastPlayerMove");
    private final static QName _GetLastPlayerMoveResponse_QNAME = new QName("http://example.org/", "getLastPlayerMoveResponse");
    private final static QName _MakeMove_QNAME = new QName("http://example.org/", "makeMove");
    private final static QName _MakeMoveResponse_QNAME = new QName("http://example.org/", "makeMoveResponse");
    private final static QName _SetCur_QNAME = new QName("http://example.org/", "setCur");
    private final static QName _SetCurResponse_QNAME = new QName("http://example.org/", "setCurResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConnectPlayer }
     * 
     */
    public ConnectPlayer createConnectPlayer() {
        return new ConnectPlayer();
    }

    /**
     * Create an instance of {@link ConnectPlayerResponse }
     * 
     */
    public ConnectPlayerResponse createConnectPlayerResponse() {
        return new ConnectPlayerResponse();
    }

    /**
     * Create an instance of {@link GetCur }
     * 
     */
    public GetCur createGetCur() {
        return new GetCur();
    }

    /**
     * Create an instance of {@link GetCurResponse }
     * 
     */
    public GetCurResponse createGetCurResponse() {
        return new GetCurResponse();
    }

    /**
     * Create an instance of {@link GetLastMove }
     * 
     */
    public GetLastMove createGetLastMove() {
        return new GetLastMove();
    }

    /**
     * Create an instance of {@link GetLastMoveResponse }
     * 
     */
    public GetLastMoveResponse createGetLastMoveResponse() {
        return new GetLastMoveResponse();
    }

    /**
     * Create an instance of {@link GetLastPlayerMove }
     * 
     */
    public GetLastPlayerMove createGetLastPlayerMove() {
        return new GetLastPlayerMove();
    }

    /**
     * Create an instance of {@link GetLastPlayerMoveResponse }
     * 
     */
    public GetLastPlayerMoveResponse createGetLastPlayerMoveResponse() {
        return new GetLastPlayerMoveResponse();
    }

    /**
     * Create an instance of {@link MakeMove }
     * 
     */
    public MakeMove createMakeMove() {
        return new MakeMove();
    }

    /**
     * Create an instance of {@link MakeMoveResponse }
     * 
     */
    public MakeMoveResponse createMakeMoveResponse() {
        return new MakeMoveResponse();
    }

    /**
     * Create an instance of {@link SetCur }
     * 
     */
    public SetCur createSetCur() {
        return new SetCur();
    }

    /**
     * Create an instance of {@link SetCurResponse }
     * 
     */
    public SetCurResponse createSetCurResponse() {
        return new SetCurResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectPlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConnectPlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ConnectPlayer")
    public JAXBElement<ConnectPlayer> createConnectPlayer(ConnectPlayer value) {
        return new JAXBElement<ConnectPlayer>(_ConnectPlayer_QNAME, ConnectPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectPlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConnectPlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ConnectPlayerResponse")
    public JAXBElement<ConnectPlayerResponse> createConnectPlayerResponse(ConnectPlayerResponse value) {
        return new JAXBElement<ConnectPlayerResponse>(_ConnectPlayerResponse_QNAME, ConnectPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCur }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getCur")
    public JAXBElement<GetCur> createGetCur(GetCur value) {
        return new JAXBElement<GetCur>(_GetCur_QNAME, GetCur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getCurResponse")
    public JAXBElement<GetCurResponse> createGetCurResponse(GetCurResponse value) {
        return new JAXBElement<GetCurResponse>(_GetCurResponse_QNAME, GetCurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMove }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastMove }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getLastMove")
    public JAXBElement<GetLastMove> createGetLastMove(GetLastMove value) {
        return new JAXBElement<GetLastMove>(_GetLastMove_QNAME, GetLastMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getLastMoveResponse")
    public JAXBElement<GetLastMoveResponse> createGetLastMoveResponse(GetLastMoveResponse value) {
        return new JAXBElement<GetLastMoveResponse>(_GetLastMoveResponse_QNAME, GetLastMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlayerMove }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastPlayerMove }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getLastPlayerMove")
    public JAXBElement<GetLastPlayerMove> createGetLastPlayerMove(GetLastPlayerMove value) {
        return new JAXBElement<GetLastPlayerMove>(_GetLastPlayerMove_QNAME, GetLastPlayerMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlayerMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastPlayerMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getLastPlayerMoveResponse")
    public JAXBElement<GetLastPlayerMoveResponse> createGetLastPlayerMoveResponse(GetLastPlayerMoveResponse value) {
        return new JAXBElement<GetLastPlayerMoveResponse>(_GetLastPlayerMoveResponse_QNAME, GetLastPlayerMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeMove }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeMove }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "makeMove")
    public JAXBElement<MakeMove> createMakeMove(MakeMove value) {
        return new JAXBElement<MakeMove>(_MakeMove_QNAME, MakeMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "makeMoveResponse")
    public JAXBElement<MakeMoveResponse> createMakeMoveResponse(MakeMoveResponse value) {
        return new JAXBElement<MakeMoveResponse>(_MakeMoveResponse_QNAME, MakeMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCur }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "setCur")
    public JAXBElement<SetCur> createSetCur(SetCur value) {
        return new JAXBElement<SetCur>(_SetCur_QNAME, SetCur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "setCurResponse")
    public JAXBElement<SetCurResponse> createSetCurResponse(SetCurResponse value) {
        return new JAXBElement<SetCurResponse>(_SetCurResponse_QNAME, SetCurResponse.class, null, value);
    }

}
