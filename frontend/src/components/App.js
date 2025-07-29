import './../styles/App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import { Header } from './Header';
import { Buscador } from './Buscador'
import { Cards } from './Cards';
import AdminPanel from './AdminPanel';
import FormProducto from './FormProducto';
import Footer from './Footer';


function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <div className='main-content'>
          <Buscador />
          <Cards />
          <Routes>
            <Route path="/admin" element={<AdminPanel />} />
            <Route path="/admin/agregar" element={<FormProducto />} />
          </Routes>
        </div>
        <Footer />
      </div>
    </Router>
  );
}

export default App;