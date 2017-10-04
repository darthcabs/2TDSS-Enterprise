using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Fiap.Revisao2.Models;
using Fiap.Revisao2.Persistence;

namespace Fiap.Revisao2.Repositories
{
    public class EsporteRepository : IEsporteRepository
    {
        private JogosOlimpicosContext _context;

        public EsporteRepository(JogosOlimpicosContext context)
        {
            _context = context;
        }
        public void Cadastrar(Esporte esporte)
        {
            _context.Esportes.Add(esporte);
        }

        public List<Esporte> Listar()
        {
            return _context.Esportes.ToList();
        }
    }
}