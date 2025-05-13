## Code Smells covered:
1. Long method
    * Un método que realiza demasiadas tarefas, dificultando a súa comprensión e     reutilización.

2. Duplicate code within class
    * Fragmentos de código repetidos dentro da mesma clase, aumentando o risco de inconsistencias e dificultando mantemento.
3. Duplicate code within method
   * Seccións redundantes dentro dun mesmo método, reducindo eficiencia e claridade.
4. Duplicate code across classes
   * Código idéntico presente en diferentes clases, suxerindo a necesidade de unha abstracción común.
5. Magic Number
   * Uso de valores numéricos sen contexto nin nome significativo, dificultando a comprensión do código.
6. Feature Envy (2 instances)
   * Cando un método accede constantemente a datos doutra clase en lugar de operar sobre os seus propios atributos, suxerindo que debería estar na outra clase.
7. Improper Naming
   * Uso de nomes pouco descritivos para variables, métodos ou clases, dificultando a súa comprensión.
8. Dead Code
   * Fragmentos de código que nunca se executan nin se usan, ocupando espazo innecesario.
9.  Lazy Class
    * Unha clase que non achega funcionalidade significativa e podería eliminarse ou combinarse con outra.
10. Switch Case
    * Uso excesivo de sentenzas switch en lugar de polimorfismo, limitando a extensibilidade e claridade do código.
11. Indecent Exposure
    * Demasiados membros públicos expostos cando deberían ser privados ou protexidos.
12. Collapse Hierarchy (Lazy Class)
    * Clases que poden combinarse porque non engaden diferenzas significativas entre elas.
13. Long Parameter List
    * Métodos con demasiados parámetros, dificultando o seu uso e comprensión.



## Code FIXME:
* Quita el código muerto y el código duplicado.
```java
//Dead-Code Code Smell fixed by removing getPlayerName and printMove methods (and also toString of Position),
    // as well as player 1 and player 2 fields.

 //Fixed Duplicate Code across methods of same class Code-Smell by calling isEmpty method
    public Piece getPiece(Position position)
    {
        return isEmpty(position) ? null : getCell(position).getPiece();
    }
```
* Reduce la cantidad de parámetros e Agrupa datos relacionados.
```java
//Fixed long parameter list code smell: Pass the object itself instead of passing its data.
    // (isValidMove, movePiece, updateIsKingDead, updatePawnStatus)
    public boolean isValidMove(Position from, Position to)
    {
        return !from.equals(to)
               && !(isPositionOutOfBounds(from) || isPositionOutOfBounds(to))
               && !isEmpty(from)
               && (isEmpty(to) || getPiece(from).getColor() != getPiece(to).getColor())
               && getPiece(from).isValidMove(from, to)
               && hasNoPieceInPath(from, to)
               && (!(getPiece(from) instanceof Pawn) || isValidPawnMove(from, to));
    }
```
* Evita clases innecesarias que solo estorban y Mejora la cohesión.
```java
//Fixed Lazy-class Code Smell by removing MoveUtil class
    public void makeMove(Position from, Position to)
    {
        _chessBoard.movePiece(from, to);
        System.out.println("Piece moved for Player : " + _currentPlayer);
        System.out.println("");
        System.out.println(_chessBoard);
        if (_chessBoard.isKingDead()) {
            endGame();
            initGame();
        } else {
            _currentPlayer = getOtherPlayer();
        }
    }
```
* Reduce complejidad innecesaria y evita tener pequeñas clases utilitarias dispersas.
```java
//Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Bishop extends Piece
{

    public Bishop(Color color)
    {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isDiagonalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "b";
    }
}
```
* Elimina condicionales innecesarias
```java
//Fixed Switch-case code smell through polymorphism. Note that type field has also been removed.
    public abstract boolean isValidMove(Position from, Position to);
```
* Reduce complejidad estructural innecesaria y Aumenta la cohesión.
```java
/Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isHorizontalOrVerticalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "r";
    }
}
```