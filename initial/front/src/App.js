import logo from './logo.svg';
import './App.css';
import CategoryList from './components/CategoryCard/CategoryList';
import CreateCategory from './components/CategoryCard/CreateCategory';

function App() {
  return (
    <div>
      <CategoryList></CategoryList>
      <CreateCategory></CreateCategory>
    </div>
  );
}

export default App;
