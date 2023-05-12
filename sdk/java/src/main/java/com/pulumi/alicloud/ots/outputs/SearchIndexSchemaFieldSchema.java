// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SearchIndexSchemaFieldSchema {
    /**
     * @return Specifies the type of the analyzer that you want to use. If fieldType is set to Text, you can configure this parameter. Otherwise, the default analyzer type single-word tokenization is used.
     * 
     */
    private final @Nullable String analyzer;
    /**
     * @return Specifies whether to enable sorting and aggregation. Type: Boolean. Sorting can be enabled only for fields for which enable_sort_and_agg is set to true.
     * 
     */
    private final @Nullable Boolean enableSortAndAgg;
    /**
     * @return The name of the field that is used to sort data. only required if sorter_type is FieldSort.
     * 
     */
    private final String fieldName;
    /**
     * @return Specifies the type of the field. Use FieldType.XXX to set the type.
     * 
     */
    private final String fieldType;
    /**
     * @return Specifies whether to enable indexing for the column. Type: Boolean.
     * 
     */
    private final @Nullable Boolean index;
    /**
     * @return Specifies whether the value is an array. Type: Boolean.
     * 
     */
    private final @Nullable Boolean isArray;
    /**
     * @return Specifies whether to store the value of the field in the search index. Type: Boolean. If you set store to true, you can read the value of the field from the search index without querying the data table. This improves query performance.
     * 
     */
    private final @Nullable Boolean store;

    @CustomType.Constructor
    private SearchIndexSchemaFieldSchema(
        @CustomType.Parameter("analyzer") @Nullable String analyzer,
        @CustomType.Parameter("enableSortAndAgg") @Nullable Boolean enableSortAndAgg,
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("fieldType") String fieldType,
        @CustomType.Parameter("index") @Nullable Boolean index,
        @CustomType.Parameter("isArray") @Nullable Boolean isArray,
        @CustomType.Parameter("store") @Nullable Boolean store) {
        this.analyzer = analyzer;
        this.enableSortAndAgg = enableSortAndAgg;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.index = index;
        this.isArray = isArray;
        this.store = store;
    }

    /**
     * @return Specifies the type of the analyzer that you want to use. If fieldType is set to Text, you can configure this parameter. Otherwise, the default analyzer type single-word tokenization is used.
     * 
     */
    public Optional<String> analyzer() {
        return Optional.ofNullable(this.analyzer);
    }
    /**
     * @return Specifies whether to enable sorting and aggregation. Type: Boolean. Sorting can be enabled only for fields for which enable_sort_and_agg is set to true.
     * 
     */
    public Optional<Boolean> enableSortAndAgg() {
        return Optional.ofNullable(this.enableSortAndAgg);
    }
    /**
     * @return The name of the field that is used to sort data. only required if sorter_type is FieldSort.
     * 
     */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * @return Specifies the type of the field. Use FieldType.XXX to set the type.
     * 
     */
    public String fieldType() {
        return this.fieldType;
    }
    /**
     * @return Specifies whether to enable indexing for the column. Type: Boolean.
     * 
     */
    public Optional<Boolean> index() {
        return Optional.ofNullable(this.index);
    }
    /**
     * @return Specifies whether the value is an array. Type: Boolean.
     * 
     */
    public Optional<Boolean> isArray() {
        return Optional.ofNullable(this.isArray);
    }
    /**
     * @return Specifies whether to store the value of the field in the search index. Type: Boolean. If you set store to true, you can read the value of the field from the search index without querying the data table. This improves query performance.
     * 
     */
    public Optional<Boolean> store() {
        return Optional.ofNullable(this.store);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchIndexSchemaFieldSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String analyzer;
        private @Nullable Boolean enableSortAndAgg;
        private String fieldName;
        private String fieldType;
        private @Nullable Boolean index;
        private @Nullable Boolean isArray;
        private @Nullable Boolean store;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchIndexSchemaFieldSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzer = defaults.analyzer;
    	      this.enableSortAndAgg = defaults.enableSortAndAgg;
    	      this.fieldName = defaults.fieldName;
    	      this.fieldType = defaults.fieldType;
    	      this.index = defaults.index;
    	      this.isArray = defaults.isArray;
    	      this.store = defaults.store;
        }

        public Builder analyzer(@Nullable String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public Builder enableSortAndAgg(@Nullable Boolean enableSortAndAgg) {
            this.enableSortAndAgg = enableSortAndAgg;
            return this;
        }
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder fieldType(String fieldType) {
            this.fieldType = Objects.requireNonNull(fieldType);
            return this;
        }
        public Builder index(@Nullable Boolean index) {
            this.index = index;
            return this;
        }
        public Builder isArray(@Nullable Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Builder store(@Nullable Boolean store) {
            this.store = store;
            return this;
        }        public SearchIndexSchemaFieldSchema build() {
            return new SearchIndexSchemaFieldSchema(analyzer, enableSortAndAgg, fieldName, fieldType, index, isArray, store);
        }
    }
}
