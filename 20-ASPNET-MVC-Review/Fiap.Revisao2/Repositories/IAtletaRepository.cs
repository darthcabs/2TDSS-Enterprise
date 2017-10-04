using Fiap.Revisao2.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Revisao2.Repositories
{
    public interface IAtletaRepository
    {
        void Cadastrar(Atleta atleta);
        void Remover(int id);
        void Atualizar(Atleta atleta);
        Atleta Buscar(int id);
        List<Atleta> Listar();
        List<Atleta> BuscarPor(Expression<Func<Atleta,bool>> filtro);
    }
}
