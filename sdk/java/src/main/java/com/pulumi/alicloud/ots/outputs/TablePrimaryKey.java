// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TablePrimaryKey {
    /**
     * @return Name for primary key.
     * 
     */
    private String name;
    /**
     * @return Type for primary key. Only `Integer`, `String` or `Binary` is allowed.
     * 
     */
    private String type;

    private TablePrimaryKey() {}
    /**
     * @return Name for primary key.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Type for primary key. Only `Integer`, `String` or `Binary` is allowed.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TablePrimaryKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(TablePrimaryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TablePrimaryKey build() {
            final var _resultValue = new TablePrimaryKey();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
