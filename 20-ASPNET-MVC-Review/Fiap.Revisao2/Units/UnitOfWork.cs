using Fiap.Revisao2.Persistence;
using Fiap.Revisao2.Repositories;
using System;

namespace Fiap.Revisao2.Units
{
    public class UnitOfWork : IDisposable
    {
        private JogosOlimpicosContext _context = new JogosOlimpicosContext();

        private IAtletaRepository _atletaRepository;
        public IAtletaRepository AtletaRepository
        {
            get
            {
                if (_atletaRepository == null)
                    _atletaRepository = new AtletaRepository(_context);

                return _atletaRepository;
            }
        }

        private IEsporteRepository _esporteRepository;
        public IEsporteRepository EsporteRepository
        {
            get
            {
                if (_esporteRepository == null)
                    _esporteRepository = new EsporteRepository(_context);

                return _esporteRepository;
            }
        }

        public void Salvar()
        {
            _context.SaveChanges();
        }

        public void Dispose()
        {
            if (_context != null)
                _context.Dispose();

            GC.SuppressFinalize(this);
        }
    }
}