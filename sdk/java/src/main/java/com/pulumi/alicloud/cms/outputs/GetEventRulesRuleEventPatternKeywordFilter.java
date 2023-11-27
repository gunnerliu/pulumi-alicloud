// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEventRulesRuleEventPatternKeywordFilter {
    /**
     * @return The keywords that are used to match events.
     * 
     */
    private List<String> keyWords;
    /**
     * @return The relationship between multiple keywords in a condition.
     * 
     */
    private String relation;

    private GetEventRulesRuleEventPatternKeywordFilter() {}
    /**
     * @return The keywords that are used to match events.
     * 
     */
    public List<String> keyWords() {
        return this.keyWords;
    }
    /**
     * @return The relationship between multiple keywords in a condition.
     * 
     */
    public String relation() {
        return this.relation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventRulesRuleEventPatternKeywordFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> keyWords;
        private String relation;
        public Builder() {}
        public Builder(GetEventRulesRuleEventPatternKeywordFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyWords = defaults.keyWords;
    	      this.relation = defaults.relation;
        }

        @CustomType.Setter
        public Builder keyWords(List<String> keyWords) {
            this.keyWords = Objects.requireNonNull(keyWords);
            return this;
        }
        public Builder keyWords(String... keyWords) {
            return keyWords(List.of(keyWords));
        }
        @CustomType.Setter
        public Builder relation(String relation) {
            this.relation = Objects.requireNonNull(relation);
            return this;
        }
        public GetEventRulesRuleEventPatternKeywordFilter build() {
            final var _resultValue = new GetEventRulesRuleEventPatternKeywordFilter();
            _resultValue.keyWords = keyWords;
            _resultValue.relation = relation;
            return _resultValue;
        }
    }
}
