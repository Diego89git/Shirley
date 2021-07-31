-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-07-2021 a las 21:07:00
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabeceracompra`
--

CREATE TABLE `cabeceracompra` (
  `Id` int(11) NOT NULL,
  `TipodeComprobante` varchar(60) NOT NULL,
  `NumeroComprobante` varchar(15) NOT NULL,
  `idProveedor` varchar(50) NOT NULL,
  `Fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cabeceracompra`
--

INSERT INTO `cabeceracompra` (`Id`, `TipodeComprobante`, `NumeroComprobante`, `idProveedor`, `Fecha`) VALUES
(1234678987, 'Fc', '00100133564678', '1892837445', '2021-07-07'),
(2147483647, 'Cedula ', '00100133564678', '1892837445', '2021-07-07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabeceraventa`
--

CREATE TABLE `cabeceraventa` (
  `Id` int(11) NOT NULL,
  `CabCliente` varchar(50) NOT NULL,
  `TipodeComprobante` varchar(80) NOT NULL,
  `NúmerodeComprobante` int(11) NOT NULL,
  `Fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cabeceraventa`
--

INSERT INTO `cabeceraventa` (`Id`, `CabCliente`, `TipodeComprobante`, `NúmerodeComprobante`, `Fecha`) VALUES
(1273849403, 'trtrtyty', 'wewrwer', 45678, '2021-07-17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Id` varchar(15) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(25) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Dirección` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Id`, `Nombre`, `Apellido`, `Correo`, `Dirección`) VALUES
('1273849403', 'Carlos', 'Torres', 'hdjejdededefne', 'dedededed');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `Id` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `PrecioUnitario` int(11) NOT NULL,
  `PrecioTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`Id`, `idProducto`, `Cantidad`, `PrecioUnitario`, `PrecioTotal`) VALUES
(1273849403, 344444, 1, 123, 123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `Id` int(11) NOT NULL,
  `CabeceraVenta` int(11) NOT NULL,
  `DetProducto` varchar(25) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `PrecioUnitario` int(11) NOT NULL,
  `PrecioTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`Id`, `CabeceraVenta`, `DetProducto`, `Cantidad`, `PrecioUnitario`, `PrecioTotal`) VALUES
(223, 1212, 'dedede', 12, 123, 1232);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `Codigo` varchar(50) NOT NULL,
  `Descripción` varchar(200) NOT NULL,
  `Categoria` varchar(100) NOT NULL,
  `Modelo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`Codigo`, `Descripción`, `Categoria`, `Modelo`) VALUES
('WERTUSDFG', 'Material cuerina ,Base cromada', 'Muebles', 'TUCSON');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `Identificación` varchar(40) NOT NULL,
  `TipoIdentificación` varchar(50) NOT NULL,
  `NombreComercial` varchar(60) NOT NULL,
  `Representante` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`Identificación`, `TipoIdentificación`, `NombreComercial`, `Representante`) VALUES
('1892837445', 'Cedula', 'Arte Mueble', 'Luis Silva');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(15) NOT NULL,
  `Descripción` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`Id`, `Nombre`, `Descripción`) VALUES
(1, 'Administrador', 'Control y acceso a todo el programa'),
(2, 'Bodeguero', 'Encargado de bodegas'),
(3, 'Cajero', 'Encargado de la contabilidad y finanzas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(15) NOT NULL,
  `Apellido` varchar(15) NOT NULL,
  `Correo` varchar(70) NOT NULL,
  `Contraseña` varchar(20) NOT NULL,
  `Dirección` varchar(100) NOT NULL,
  `Numero de celular` varchar(10) NOT NULL,
  `idRol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Id`, `Nombre`, `Apellido`, `Correo`, `Contraseña`, `Dirección`, `Numero de celular`, `idRol`) VALUES
(1, 'Carlos', 'Torres', 'xjwdnkcncwencnjecknec', '1234', 'kwsn2kn2n3e', '233223456', 123456789);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cabeceracompra`
--
ALTER TABLE `cabeceracompra`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `cabeceraventa`
--
ALTER TABLE `cabeceraventa`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cabeceracompra`
--
ALTER TABLE `cabeceracompra`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2147483648;

--
-- AUTO_INCREMENT de la tabla `cabeceraventa`
--
ALTER TABLE `cabeceraventa`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1273849404;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1273849404;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=224;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
