// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventRuleEventPattern {
    /**
     * @return The type of the event-triggered alert rule. Valid values:
     * - `StatusNotification`: fault notifications.
     * - `Exception`: exceptions.
     * - `Maintenance`: O&amp;M.
     * - `*`: all types.
     * 
     */
    private @Nullable List<String> eventTypeLists;
    /**
     * @return The level of the event-triggered alert rule. Valid values:
     * - `CRITICAL`: critical.
     * - `WARN`: warning.
     * - `INFO`: information.
     * - `*`: all types.
     * 
     */
    private @Nullable List<String> levelLists;
    /**
     * @return The name of the event-triggered alert rule.
     * 
     */
    private @Nullable List<String> nameLists;
    /**
     * @return The type of the cloud service.
     * 
     */
    private String product;
    /**
     * @return The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.
     * 
     */
    private @Nullable String sqlFilter;

    private EventRuleEventPattern() {}
    /**
     * @return The type of the event-triggered alert rule. Valid values:
     * - `StatusNotification`: fault notifications.
     * - `Exception`: exceptions.
     * - `Maintenance`: O&amp;M.
     * - `*`: all types.
     * 
     */
    public List<String> eventTypeLists() {
        return this.eventTypeLists == null ? List.of() : this.eventTypeLists;
    }
    /**
     * @return The level of the event-triggered alert rule. Valid values:
     * - `CRITICAL`: critical.
     * - `WARN`: warning.
     * - `INFO`: information.
     * - `*`: all types.
     * 
     */
    public List<String> levelLists() {
        return this.levelLists == null ? List.of() : this.levelLists;
    }
    /**
     * @return The name of the event-triggered alert rule.
     * 
     */
    public List<String> nameLists() {
        return this.nameLists == null ? List.of() : this.nameLists;
    }
    /**
     * @return The type of the cloud service.
     * 
     */
    public String product() {
        return this.product;
    }
    /**
     * @return The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.
     * 
     */
    public Optional<String> sqlFilter() {
        return Optional.ofNullable(this.sqlFilter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRuleEventPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> eventTypeLists;
        private @Nullable List<String> levelLists;
        private @Nullable List<String> nameLists;
        private String product;
        private @Nullable String sqlFilter;
        public Builder() {}
        public Builder(EventRuleEventPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypeLists = defaults.eventTypeLists;
    	      this.levelLists = defaults.levelLists;
    	      this.nameLists = defaults.nameLists;
    	      this.product = defaults.product;
    	      this.sqlFilter = defaults.sqlFilter;
        }

        @CustomType.Setter
        public Builder eventTypeLists(@Nullable List<String> eventTypeLists) {
            this.eventTypeLists = eventTypeLists;
            return this;
        }
        public Builder eventTypeLists(String... eventTypeLists) {
            return eventTypeLists(List.of(eventTypeLists));
        }
        @CustomType.Setter
        public Builder levelLists(@Nullable List<String> levelLists) {
            this.levelLists = levelLists;
            return this;
        }
        public Builder levelLists(String... levelLists) {
            return levelLists(List.of(levelLists));
        }
        @CustomType.Setter
        public Builder nameLists(@Nullable List<String> nameLists) {
            this.nameLists = nameLists;
            return this;
        }
        public Builder nameLists(String... nameLists) {
            return nameLists(List.of(nameLists));
        }
        @CustomType.Setter
        public Builder product(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }
        @CustomType.Setter
        public Builder sqlFilter(@Nullable String sqlFilter) {
            this.sqlFilter = sqlFilter;
            return this;
        }
        public EventRuleEventPattern build() {
            final var o = new EventRuleEventPattern();
            o.eventTypeLists = eventTypeLists;
            o.levelLists = levelLists;
            o.nameLists = nameLists;
            o.product = product;
            o.sqlFilter = sqlFilter;
            return o;
        }
    }
}
