package es.tragsatec.pssa.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimalesExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCrotalIsNull() {
            addCriterion("crotal is null");
            return (Criteria) this;
        }

        public Criteria andCrotalIsNotNull() {
            addCriterion("crotal is not null");
            return (Criteria) this;
        }

        public Criteria andCrotalEqualTo(String value) {
            addCriterion("crotal =", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalNotEqualTo(String value) {
            addCriterion("crotal <>", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalGreaterThan(String value) {
            addCriterion("crotal >", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalGreaterThanOrEqualTo(String value) {
            addCriterion("crotal >=", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalLessThan(String value) {
            addCriterion("crotal <", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalLessThanOrEqualTo(String value) {
            addCriterion("crotal <=", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalLike(String value) {
            addCriterion("crotal like", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalNotLike(String value) {
            addCriterion("crotal not like", value, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalIn(List<String> values) {
            addCriterion("crotal in", values, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalNotIn(List<String> values) {
            addCriterion("crotal not in", values, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalBetween(String value1, String value2) {
            addCriterion("crotal between", value1, value2, "crotal");
            return (Criteria) this;
        }

        public Criteria andCrotalNotBetween(String value1, String value2) {
            addCriterion("crotal not between", value1, value2, "crotal");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNull() {
            addCriterion("fechainicio is null");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNotNull() {
            addCriterion("fechainicio is not null");
            return (Criteria) this;
        }

        public Criteria andFechainicioEqualTo(String value) {
            addCriterion("fechainicio =", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotEqualTo(String value) {
            addCriterion("fechainicio <>", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThan(String value) {
            addCriterion("fechainicio >", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThanOrEqualTo(String value) {
            addCriterion("fechainicio >=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThan(String value) {
            addCriterion("fechainicio <", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThanOrEqualTo(String value) {
            addCriterion("fechainicio <=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLike(String value) {
            addCriterion("fechainicio like", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotLike(String value) {
            addCriterion("fechainicio not like", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioIn(List<String> values) {
            addCriterion("fechainicio in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotIn(List<String> values) {
            addCriterion("fechainicio not in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioBetween(String value1, String value2) {
            addCriterion("fechainicio between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotBetween(String value1, String value2) {
            addCriterion("fechainicio not between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechafinIsNull() {
            addCriterion("fechafin is null");
            return (Criteria) this;
        }

        public Criteria andFechafinIsNotNull() {
            addCriterion("fechafin is not null");
            return (Criteria) this;
        }

        public Criteria andFechafinEqualTo(String value) {
            addCriterion("fechafin =", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinNotEqualTo(String value) {
            addCriterion("fechafin <>", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinGreaterThan(String value) {
            addCriterion("fechafin >", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinGreaterThanOrEqualTo(String value) {
            addCriterion("fechafin >=", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinLessThan(String value) {
            addCriterion("fechafin <", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinLessThanOrEqualTo(String value) {
            addCriterion("fechafin <=", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinLike(String value) {
            addCriterion("fechafin like", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinNotLike(String value) {
            addCriterion("fechafin not like", value, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinIn(List<String> values) {
            addCriterion("fechafin in", values, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinNotIn(List<String> values) {
            addCriterion("fechafin not in", values, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinBetween(String value1, String value2) {
            addCriterion("fechafin between", value1, value2, "fechafin");
            return (Criteria) this;
        }

        public Criteria andFechafinNotBetween(String value1, String value2) {
            addCriterion("fechafin not between", value1, value2, "fechafin");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaIsNull() {
            addCriterion("explotacionpertenencia is null");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaIsNotNull() {
            addCriterion("explotacionpertenencia is not null");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaEqualTo(String value) {
            addCriterion("explotacionpertenencia =", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaNotEqualTo(String value) {
            addCriterion("explotacionpertenencia <>", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaGreaterThan(String value) {
            addCriterion("explotacionpertenencia >", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaGreaterThanOrEqualTo(String value) {
            addCriterion("explotacionpertenencia >=", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaLessThan(String value) {
            addCriterion("explotacionpertenencia <", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaLessThanOrEqualTo(String value) {
            addCriterion("explotacionpertenencia <=", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaLike(String value) {
            addCriterion("explotacionpertenencia like", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaNotLike(String value) {
            addCriterion("explotacionpertenencia not like", value, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaIn(List<String> values) {
            addCriterion("explotacionpertenencia in", values, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaNotIn(List<String> values) {
            addCriterion("explotacionpertenencia not in", values, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaBetween(String value1, String value2) {
            addCriterion("explotacionpertenencia between", value1, value2, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionpertenenciaNotBetween(String value1, String value2) {
            addCriterion("explotacionpertenencia not between", value1, value2, "explotacionpertenencia");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionIsNull() {
            addCriterion("explotacionubicacion is null");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionIsNotNull() {
            addCriterion("explotacionubicacion is not null");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionEqualTo(String value) {
            addCriterion("explotacionubicacion =", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionNotEqualTo(String value) {
            addCriterion("explotacionubicacion <>", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionGreaterThan(String value) {
            addCriterion("explotacionubicacion >", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionGreaterThanOrEqualTo(String value) {
            addCriterion("explotacionubicacion >=", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionLessThan(String value) {
            addCriterion("explotacionubicacion <", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionLessThanOrEqualTo(String value) {
            addCriterion("explotacionubicacion <=", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionLike(String value) {
            addCriterion("explotacionubicacion like", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionNotLike(String value) {
            addCriterion("explotacionubicacion not like", value, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionIn(List<String> values) {
            addCriterion("explotacionubicacion in", values, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionNotIn(List<String> values) {
            addCriterion("explotacionubicacion not in", values, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionBetween(String value1, String value2) {
            addCriterion("explotacionubicacion between", value1, value2, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andExplotacionubicacionNotBetween(String value1, String value2) {
            addCriterion("explotacionubicacion not between", value1, value2, "explotacionubicacion");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoIsNull() {
            addCriterion("fechanacimiento is null");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoIsNotNull() {
            addCriterion("fechanacimiento is not null");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoEqualTo(String value) {
            addCriterion("fechanacimiento =", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoNotEqualTo(String value) {
            addCriterion("fechanacimiento <>", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoGreaterThan(String value) {
            addCriterion("fechanacimiento >", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoGreaterThanOrEqualTo(String value) {
            addCriterion("fechanacimiento >=", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoLessThan(String value) {
            addCriterion("fechanacimiento <", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoLessThanOrEqualTo(String value) {
            addCriterion("fechanacimiento <=", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoLike(String value) {
            addCriterion("fechanacimiento like", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoNotLike(String value) {
            addCriterion("fechanacimiento not like", value, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoIn(List<String> values) {
            addCriterion("fechanacimiento in", values, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoNotIn(List<String> values) {
            addCriterion("fechanacimiento not in", values, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoBetween(String value1, String value2) {
            addCriterion("fechanacimiento between", value1, value2, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andFechanacimientoNotBetween(String value1, String value2) {
            addCriterion("fechanacimiento not between", value1, value2, "fechanacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoIsNull() {
            addCriterion("explotacionnacimiento is null");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoIsNotNull() {
            addCriterion("explotacionnacimiento is not null");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoEqualTo(String value) {
            addCriterion("explotacionnacimiento =", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoNotEqualTo(String value) {
            addCriterion("explotacionnacimiento <>", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoGreaterThan(String value) {
            addCriterion("explotacionnacimiento >", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoGreaterThanOrEqualTo(String value) {
            addCriterion("explotacionnacimiento >=", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoLessThan(String value) {
            addCriterion("explotacionnacimiento <", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoLessThanOrEqualTo(String value) {
            addCriterion("explotacionnacimiento <=", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoLike(String value) {
            addCriterion("explotacionnacimiento like", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoNotLike(String value) {
            addCriterion("explotacionnacimiento not like", value, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoIn(List<String> values) {
            addCriterion("explotacionnacimiento in", values, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoNotIn(List<String> values) {
            addCriterion("explotacionnacimiento not in", values, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoBetween(String value1, String value2) {
            addCriterion("explotacionnacimiento between", value1, value2, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andExplotacionnacimientoNotBetween(String value1, String value2) {
            addCriterion("explotacionnacimiento not between", value1, value2, "explotacionnacimiento");
            return (Criteria) this;
        }

        public Criteria andSexoIsNull() {
            addCriterion("sexo is null");
            return (Criteria) this;
        }

        public Criteria andSexoIsNotNull() {
            addCriterion("sexo is not null");
            return (Criteria) this;
        }

        public Criteria andSexoEqualTo(String value) {
            addCriterion("sexo =", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotEqualTo(String value) {
            addCriterion("sexo <>", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoGreaterThan(String value) {
            addCriterion("sexo >", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoGreaterThanOrEqualTo(String value) {
            addCriterion("sexo >=", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLessThan(String value) {
            addCriterion("sexo <", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLessThanOrEqualTo(String value) {
            addCriterion("sexo <=", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLike(String value) {
            addCriterion("sexo like", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotLike(String value) {
            addCriterion("sexo not like", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoIn(List<String> values) {
            addCriterion("sexo in", values, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotIn(List<String> values) {
            addCriterion("sexo not in", values, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoBetween(String value1, String value2) {
            addCriterion("sexo between", value1, value2, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotBetween(String value1, String value2) {
            addCriterion("sexo not between", value1, value2, "sexo");
            return (Criteria) this;
        }

        public Criteria andRazaIsNull() {
            addCriterion("raza is null");
            return (Criteria) this;
        }

        public Criteria andRazaIsNotNull() {
            addCriterion("raza is not null");
            return (Criteria) this;
        }

        public Criteria andRazaEqualTo(String value) {
            addCriterion("raza =", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaNotEqualTo(String value) {
            addCriterion("raza <>", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaGreaterThan(String value) {
            addCriterion("raza >", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaGreaterThanOrEqualTo(String value) {
            addCriterion("raza >=", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaLessThan(String value) {
            addCriterion("raza <", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaLessThanOrEqualTo(String value) {
            addCriterion("raza <=", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaLike(String value) {
            addCriterion("raza like", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaNotLike(String value) {
            addCriterion("raza not like", value, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaIn(List<String> values) {
            addCriterion("raza in", values, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaNotIn(List<String> values) {
            addCriterion("raza not in", values, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaBetween(String value1, String value2) {
            addCriterion("raza between", value1, value2, "raza");
            return (Criteria) this;
        }

        public Criteria andRazaNotBetween(String value1, String value2) {
            addCriterion("raza not between", value1, value2, "raza");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreIsNull() {
            addCriterion("crotalmadre is null");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreIsNotNull() {
            addCriterion("crotalmadre is not null");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreEqualTo(String value) {
            addCriterion("crotalmadre =", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreNotEqualTo(String value) {
            addCriterion("crotalmadre <>", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreGreaterThan(String value) {
            addCriterion("crotalmadre >", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreGreaterThanOrEqualTo(String value) {
            addCriterion("crotalmadre >=", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreLessThan(String value) {
            addCriterion("crotalmadre <", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreLessThanOrEqualTo(String value) {
            addCriterion("crotalmadre <=", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreLike(String value) {
            addCriterion("crotalmadre like", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreNotLike(String value) {
            addCriterion("crotalmadre not like", value, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreIn(List<String> values) {
            addCriterion("crotalmadre in", values, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreNotIn(List<String> values) {
            addCriterion("crotalmadre not in", values, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreBetween(String value1, String value2) {
            addCriterion("crotalmadre between", value1, value2, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCrotalmadreNotBetween(String value1, String value2) {
            addCriterion("crotalmadre not between", value1, value2, "crotalmadre");
            return (Criteria) this;
        }

        public Criteria andCausaaltaIsNull() {
            addCriterion("causaalta is null");
            return (Criteria) this;
        }

        public Criteria andCausaaltaIsNotNull() {
            addCriterion("causaalta is not null");
            return (Criteria) this;
        }

        public Criteria andCausaaltaEqualTo(String value) {
            addCriterion("causaalta =", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaNotEqualTo(String value) {
            addCriterion("causaalta <>", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaGreaterThan(String value) {
            addCriterion("causaalta >", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaGreaterThanOrEqualTo(String value) {
            addCriterion("causaalta >=", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaLessThan(String value) {
            addCriterion("causaalta <", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaLessThanOrEqualTo(String value) {
            addCriterion("causaalta <=", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaLike(String value) {
            addCriterion("causaalta like", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaNotLike(String value) {
            addCriterion("causaalta not like", value, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaIn(List<String> values) {
            addCriterion("causaalta in", values, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaNotIn(List<String> values) {
            addCriterion("causaalta not in", values, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaBetween(String value1, String value2) {
            addCriterion("causaalta between", value1, value2, "causaalta");
            return (Criteria) this;
        }

        public Criteria andCausaaltaNotBetween(String value1, String value2) {
            addCriterion("causaalta not between", value1, value2, "causaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaIsNull() {
            addCriterion("fechaalta is null");
            return (Criteria) this;
        }

        public Criteria andFechaaltaIsNotNull() {
            addCriterion("fechaalta is not null");
            return (Criteria) this;
        }

        public Criteria andFechaaltaEqualTo(String value) {
            addCriterion("fechaalta =", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaNotEqualTo(String value) {
            addCriterion("fechaalta <>", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaGreaterThan(String value) {
            addCriterion("fechaalta >", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaGreaterThanOrEqualTo(String value) {
            addCriterion("fechaalta >=", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaLessThan(String value) {
            addCriterion("fechaalta <", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaLessThanOrEqualTo(String value) {
            addCriterion("fechaalta <=", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaLike(String value) {
            addCriterion("fechaalta like", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaNotLike(String value) {
            addCriterion("fechaalta not like", value, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaIn(List<String> values) {
            addCriterion("fechaalta in", values, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaNotIn(List<String> values) {
            addCriterion("fechaalta not in", values, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaBetween(String value1, String value2) {
            addCriterion("fechaalta between", value1, value2, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andFechaaltaNotBetween(String value1, String value2) {
            addCriterion("fechaalta not between", value1, value2, "fechaalta");
            return (Criteria) this;
        }

        public Criteria andProcedenciaIsNull() {
            addCriterion("procedencia is null");
            return (Criteria) this;
        }

        public Criteria andProcedenciaIsNotNull() {
            addCriterion("procedencia is not null");
            return (Criteria) this;
        }

        public Criteria andProcedenciaEqualTo(String value) {
            addCriterion("procedencia =", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaNotEqualTo(String value) {
            addCriterion("procedencia <>", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaGreaterThan(String value) {
            addCriterion("procedencia >", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaGreaterThanOrEqualTo(String value) {
            addCriterion("procedencia >=", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaLessThan(String value) {
            addCriterion("procedencia <", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaLessThanOrEqualTo(String value) {
            addCriterion("procedencia <=", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaLike(String value) {
            addCriterion("procedencia like", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaNotLike(String value) {
            addCriterion("procedencia not like", value, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaIn(List<String> values) {
            addCriterion("procedencia in", values, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaNotIn(List<String> values) {
            addCriterion("procedencia not in", values, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaBetween(String value1, String value2) {
            addCriterion("procedencia between", value1, value2, "procedencia");
            return (Criteria) this;
        }

        public Criteria andProcedenciaNotBetween(String value1, String value2) {
            addCriterion("procedencia not between", value1, value2, "procedencia");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaIsNull() {
            addCriterion("codigolocalentrada is null");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaIsNotNull() {
            addCriterion("codigolocalentrada is not null");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaEqualTo(String value) {
            addCriterion("codigolocalentrada =", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaNotEqualTo(String value) {
            addCriterion("codigolocalentrada <>", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaGreaterThan(String value) {
            addCriterion("codigolocalentrada >", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaGreaterThanOrEqualTo(String value) {
            addCriterion("codigolocalentrada >=", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaLessThan(String value) {
            addCriterion("codigolocalentrada <", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaLessThanOrEqualTo(String value) {
            addCriterion("codigolocalentrada <=", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaLike(String value) {
            addCriterion("codigolocalentrada like", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaNotLike(String value) {
            addCriterion("codigolocalentrada not like", value, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaIn(List<String> values) {
            addCriterion("codigolocalentrada in", values, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaNotIn(List<String> values) {
            addCriterion("codigolocalentrada not in", values, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaBetween(String value1, String value2) {
            addCriterion("codigolocalentrada between", value1, value2, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigolocalentradaNotBetween(String value1, String value2) {
            addCriterion("codigolocalentrada not between", value1, value2, "codigolocalentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaIsNull() {
            addCriterion("codigoremoentrada is null");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaIsNotNull() {
            addCriterion("codigoremoentrada is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaEqualTo(String value) {
            addCriterion("codigoremoentrada =", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaNotEqualTo(String value) {
            addCriterion("codigoremoentrada <>", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaGreaterThan(String value) {
            addCriterion("codigoremoentrada >", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaGreaterThanOrEqualTo(String value) {
            addCriterion("codigoremoentrada >=", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaLessThan(String value) {
            addCriterion("codigoremoentrada <", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaLessThanOrEqualTo(String value) {
            addCriterion("codigoremoentrada <=", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaLike(String value) {
            addCriterion("codigoremoentrada like", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaNotLike(String value) {
            addCriterion("codigoremoentrada not like", value, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaIn(List<String> values) {
            addCriterion("codigoremoentrada in", values, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaNotIn(List<String> values) {
            addCriterion("codigoremoentrada not in", values, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaBetween(String value1, String value2) {
            addCriterion("codigoremoentrada between", value1, value2, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCodigoremoentradaNotBetween(String value1, String value2) {
            addCriterion("codigoremoentrada not between", value1, value2, "codigoremoentrada");
            return (Criteria) this;
        }

        public Criteria andCausabajaIsNull() {
            addCriterion("causabaja is null");
            return (Criteria) this;
        }

        public Criteria andCausabajaIsNotNull() {
            addCriterion("causabaja is not null");
            return (Criteria) this;
        }

        public Criteria andCausabajaEqualTo(String value) {
            addCriterion("causabaja =", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaNotEqualTo(String value) {
            addCriterion("causabaja <>", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaGreaterThan(String value) {
            addCriterion("causabaja >", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaGreaterThanOrEqualTo(String value) {
            addCriterion("causabaja >=", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaLessThan(String value) {
            addCriterion("causabaja <", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaLessThanOrEqualTo(String value) {
            addCriterion("causabaja <=", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaLike(String value) {
            addCriterion("causabaja like", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaNotLike(String value) {
            addCriterion("causabaja not like", value, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaIn(List<String> values) {
            addCriterion("causabaja in", values, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaNotIn(List<String> values) {
            addCriterion("causabaja not in", values, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaBetween(String value1, String value2) {
            addCriterion("causabaja between", value1, value2, "causabaja");
            return (Criteria) this;
        }

        public Criteria andCausabajaNotBetween(String value1, String value2) {
            addCriterion("causabaja not between", value1, value2, "causabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaIsNull() {
            addCriterion("fechabaja is null");
            return (Criteria) this;
        }

        public Criteria andFechabajaIsNotNull() {
            addCriterion("fechabaja is not null");
            return (Criteria) this;
        }

        public Criteria andFechabajaEqualTo(String value) {
            addCriterion("fechabaja =", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaNotEqualTo(String value) {
            addCriterion("fechabaja <>", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaGreaterThan(String value) {
            addCriterion("fechabaja >", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaGreaterThanOrEqualTo(String value) {
            addCriterion("fechabaja >=", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaLessThan(String value) {
            addCriterion("fechabaja <", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaLessThanOrEqualTo(String value) {
            addCriterion("fechabaja <=", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaLike(String value) {
            addCriterion("fechabaja like", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaNotLike(String value) {
            addCriterion("fechabaja not like", value, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaIn(List<String> values) {
            addCriterion("fechabaja in", values, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaNotIn(List<String> values) {
            addCriterion("fechabaja not in", values, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaBetween(String value1, String value2) {
            addCriterion("fechabaja between", value1, value2, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andFechabajaNotBetween(String value1, String value2) {
            addCriterion("fechabaja not between", value1, value2, "fechabaja");
            return (Criteria) this;
        }

        public Criteria andDestinoIsNull() {
            addCriterion("destino is null");
            return (Criteria) this;
        }

        public Criteria andDestinoIsNotNull() {
            addCriterion("destino is not null");
            return (Criteria) this;
        }

        public Criteria andDestinoEqualTo(String value) {
            addCriterion("destino =", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoNotEqualTo(String value) {
            addCriterion("destino <>", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoGreaterThan(String value) {
            addCriterion("destino >", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoGreaterThanOrEqualTo(String value) {
            addCriterion("destino >=", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoLessThan(String value) {
            addCriterion("destino <", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoLessThanOrEqualTo(String value) {
            addCriterion("destino <=", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoLike(String value) {
            addCriterion("destino like", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoNotLike(String value) {
            addCriterion("destino not like", value, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoIn(List<String> values) {
            addCriterion("destino in", values, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoNotIn(List<String> values) {
            addCriterion("destino not in", values, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoBetween(String value1, String value2) {
            addCriterion("destino between", value1, value2, "destino");
            return (Criteria) this;
        }

        public Criteria andDestinoNotBetween(String value1, String value2) {
            addCriterion("destino not between", value1, value2, "destino");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaIsNull() {
            addCriterion("codigolocalsalida is null");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaIsNotNull() {
            addCriterion("codigolocalsalida is not null");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaEqualTo(String value) {
            addCriterion("codigolocalsalida =", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaNotEqualTo(String value) {
            addCriterion("codigolocalsalida <>", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaGreaterThan(String value) {
            addCriterion("codigolocalsalida >", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaGreaterThanOrEqualTo(String value) {
            addCriterion("codigolocalsalida >=", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaLessThan(String value) {
            addCriterion("codigolocalsalida <", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaLessThanOrEqualTo(String value) {
            addCriterion("codigolocalsalida <=", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaLike(String value) {
            addCriterion("codigolocalsalida like", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaNotLike(String value) {
            addCriterion("codigolocalsalida not like", value, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaIn(List<String> values) {
            addCriterion("codigolocalsalida in", values, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaNotIn(List<String> values) {
            addCriterion("codigolocalsalida not in", values, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaBetween(String value1, String value2) {
            addCriterion("codigolocalsalida between", value1, value2, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigolocalsalidaNotBetween(String value1, String value2) {
            addCriterion("codigolocalsalida not between", value1, value2, "codigolocalsalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaIsNull() {
            addCriterion("codigoremosalida is null");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaIsNotNull() {
            addCriterion("codigoremosalida is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaEqualTo(String value) {
            addCriterion("codigoremosalida =", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaNotEqualTo(String value) {
            addCriterion("codigoremosalida <>", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaGreaterThan(String value) {
            addCriterion("codigoremosalida >", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaGreaterThanOrEqualTo(String value) {
            addCriterion("codigoremosalida >=", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaLessThan(String value) {
            addCriterion("codigoremosalida <", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaLessThanOrEqualTo(String value) {
            addCriterion("codigoremosalida <=", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaLike(String value) {
            addCriterion("codigoremosalida like", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaNotLike(String value) {
            addCriterion("codigoremosalida not like", value, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaIn(List<String> values) {
            addCriterion("codigoremosalida in", values, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaNotIn(List<String> values) {
            addCriterion("codigoremosalida not in", values, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaBetween(String value1, String value2) {
            addCriterion("codigoremosalida between", value1, value2, "codigoremosalida");
            return (Criteria) this;
        }

        public Criteria andCodigoremosalidaNotBetween(String value1, String value2) {
            addCriterion("codigoremosalida not between", value1, value2, "codigoremosalida");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}