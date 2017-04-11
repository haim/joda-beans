/*
 *  Copyright 2001-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.MetaBean;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class WrapperToDoubleGenerics<T extends DoubleGenericsSimpleSuper<String, ?>>
        implements ImmutableBean {

    /**
     * The type T value.
     **/
    @PropertyDefinition
    private final T base;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code WrapperToDoubleGenerics}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static WrapperToDoubleGenerics.Meta meta() {
        return WrapperToDoubleGenerics.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code WrapperToDoubleGenerics}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends DoubleGenericsSimpleSuper<String, ?>> WrapperToDoubleGenerics.Meta<R> metaWrapperToDoubleGenerics(Class<R> cls) {
        return WrapperToDoubleGenerics.Meta.INSTANCE;
    }

    static {
        MetaBean.register(WrapperToDoubleGenerics.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T extends DoubleGenericsSimpleSuper<String, ?>> WrapperToDoubleGenerics.Builder<T> builder() {
        return new WrapperToDoubleGenerics.Builder<>();
    }

    /**
     * Restricted constructor.
     * @param builder  the builder to copy from, not null
     */
    protected WrapperToDoubleGenerics(WrapperToDoubleGenerics.Builder<T> builder) {
        this.base = builder.base;
    }

    @SuppressWarnings("unchecked")
    @Override
    public WrapperToDoubleGenerics.Meta<T> metaBean() {
        return WrapperToDoubleGenerics.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the base.
     * @return the value of the property
     */
    public T getBase() {
        return base;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            WrapperToDoubleGenerics<?> other = (WrapperToDoubleGenerics<?>) obj;
            return JodaBeanUtils.equal(base, other.base);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(base);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("WrapperToDoubleGenerics{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("base").append('=').append(JodaBeanUtils.toString(base)).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code WrapperToDoubleGenerics}.
     * @param <T>  the type
     */
    public static class Meta<T extends DoubleGenericsSimpleSuper<String, ?>> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code base} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T> base = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "base", WrapperToDoubleGenerics.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "base");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3016401:  // base
                    return base;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public WrapperToDoubleGenerics.Builder<T> builder() {
            return new WrapperToDoubleGenerics.Builder<>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends WrapperToDoubleGenerics<T>> beanType() {
            return (Class) WrapperToDoubleGenerics.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code base} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<T> base() {
            return base;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3016401:  // base
                    return ((WrapperToDoubleGenerics<?>) bean).getBase();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code WrapperToDoubleGenerics}.
     * @param <T>  the type
     */
    public static class Builder<T extends DoubleGenericsSimpleSuper<String, ?>> extends DirectFieldsBeanBuilder<WrapperToDoubleGenerics<T>> {

        private T base;

        /**
         * Restricted constructor.
         */
        protected Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        protected Builder(WrapperToDoubleGenerics<T> beanToCopy) {
            this.base = beanToCopy.getBase();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3016401:  // base
                    return base;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 3016401:  // base
                    this.base = (T) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public WrapperToDoubleGenerics<T> build() {
            return new WrapperToDoubleGenerics<>(this);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the base.
         * @param base  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> base(T base) {
            this.base = base;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("WrapperToDoubleGenerics.Builder{");
            int len = buf.length();
            toString(buf);
            if (buf.length() > len) {
                buf.setLength(buf.length() - 2);
            }
            buf.append('}');
            return buf.toString();
        }

        protected void toString(StringBuilder buf) {
            buf.append("base").append('=').append(JodaBeanUtils.toString(base)).append(',').append(' ');
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
