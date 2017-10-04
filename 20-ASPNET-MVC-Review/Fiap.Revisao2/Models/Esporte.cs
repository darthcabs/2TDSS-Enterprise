using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Fiap.Revisao2.Models
{
    public class Esporte
    {
        public int EsporteId { get; set; }
        public string Nome { get; set; }

        public List<Atleta> Atletas { get; set; }
    }
}