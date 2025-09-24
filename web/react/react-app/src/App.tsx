import ListGroup from './components/ListGroup';
import Button from './components/Button';

function App() {
  const items = [
    "Rio de Janeiro",
    "São Paulo",
    "Bahia",
    "Minas Gerais",
    "Rio Grande do Sul",
    "Paraná",
    "Pernambuco",
    "Ceará",
    "Santa Catarina",
    "Goiás",
    "Espírito Santo",
    "Mato Grosso do Sul",
    "Amazonas",
    "Piauí",
    "Paraíba",
  ];



  const handleSelectItem = (item: string) => {
    console.log(item);
  };
 return (
  <div>
    <ListGroup items={items} heading='Places' onSelectItem={handleSelectItem}/>
    <Button color="secondary" onClick={() => console.log('Clicked!')}>Click me </Button>
    </div>
 );

}
export default App; 