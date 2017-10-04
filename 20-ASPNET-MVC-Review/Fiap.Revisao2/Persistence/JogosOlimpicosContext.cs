using Fiap.Revisao2.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace Fiap.Revisao2.Persistence
{
    public class JogosOlimpicosContext : DbContext
    {
        public DbSet<Atleta> Atletas { get; set; }
        public DbSet<Esporte> Esportes { get; set; }
    }
}