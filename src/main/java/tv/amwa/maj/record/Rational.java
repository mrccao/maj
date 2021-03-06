/*
 * Copyright 2016 Richard Cartwright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * $Log: Rational.java,v $
 * Revision 1.6  2011/01/05 13:09:06  vizigoth
 * Created new forge for making record and union type values.
 *
 * Revision 1.5  2011/01/04 10:40:23  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.4  2009/05/14 16:15:24  vizigoth
 * Major refactor to remove dependency on JPA and introduce better interface and implementation separation. Removed all setPropertiesFromInterface and castFromInterface methods.
 *
 * Revision 1.3  2008/10/16 16:52:01  vizigoth
 * First early release 0.1.
 *
 * Revision 1.2  2007/12/14 15:01:49  vizigoth
 * Added to and edited document comments to a release level.
 *
 * Revision 1.1  2007/11/13 22:12:51  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.record;

import tv.amwa.maj.integer.Int32;

/** 
 * <p>Specifies a rational number by means of a Java integer numerator ({@link tv.amwa.maj.integer.Int32}) and a 
 * Java integer ({@link tv.amwa.maj.integer.Int32}) denominator.</p>
 * 
 * <p>To make values of this type, use the following methods from the 
 * {@linkplain tv.amwa.maj.industry.Forge MAJ forge}:</p>
 * 
 * <ul>
 *  <li>From its numerator and denominator: 
 *  {@link tv.amwa.maj.industry.Forge#makeRational(int, int)};</li>
 *  <li>A zero <em>default</em> value: {@link tv.amwa.maj.industry.Forge#zeroRational()};</li>
 *  <li>From a string representation as generated by {@link #toString()}: 
 *  {@link tv.amwa.maj.industry.Forge#parseRational(String)}.</li>
 * </ul> 
 * 
 * @see tv.amwa.maj.industry.TypeDefinitions#Rational
 * 
 *
*/

public interface Rational { 

	/**
	 * <p>Returns the numerator of the value represented by this rational number.</p>
	 *
	 * @return Numerator part of the rational value.
	 */
	public @Int32 int getNumerator();

	/**
	 * <p>Sets the numerator of the value represented by this rational number.</p>
	 *
	 * @param numerator Numerator part of the rational value.
	 */
	public void setNumerator(
			@Int32 int numerator);	
	
	/**
	 * <p>Returns the denominator of the value represented by this rational number.</p>
	 *
	 * @return Denominator part of the rational value.
	 */
	public @Int32 int getDenominator();

	/**
	 * <p>Sets the denominator of the value represented by this rational number.</p>
	 *
	 * @param denominator Denominator part of the rational value.
	 */
	public void setDenominator(
			@Int32 int denominator);

	/**
	 * <p>Set the value of this rational number with both its numerator and denominator.</p>
	 *
	 * @param numerator Numerator part of the rational value.
	 * @param denominator Denominator part of the rational value.
	 */
	public void setRational(
			@Int32 int numerator, 
			@Int32 int denominator);
	
	/**
	 * <p>Create a cloned copy of this rational value.</p>
	 * 
	 * @return Cloned copy of this rational value.
	 */
	public Rational clone();

	/**
	 * <p>Returns the value of this rational as a Java double.</p>
	 * 
	 * @return Value of this rational as a Java double.
	 */
	public double doubleValue();
	
	/**
	 * <p>Formats a string representation of this rational value as the numerator, followed by a 
	 * slash (/), followed by the denominator. For example, "1/4". The format is the same as that
	 * parsed by {@link tv.amwa.maj.industry.Forge#parseRational(String)}.</p>
	 * 
	 * @return This rational value formatted as a string.
	 * 
	 * @see tv.amwa.maj.industry.Forge#parseRational(String)
	 */
	public String toString();
}
