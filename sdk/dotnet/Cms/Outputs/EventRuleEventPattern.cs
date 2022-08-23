// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class EventRuleEventPattern
    {
        /// <summary>
        /// The type of the event-triggered alert rule. Valid values:
        /// - `StatusNotification`: fault notifications.
        /// - `Exception`: exceptions.
        /// - `Maintenance`: O&amp;M.
        /// - `*`: all types.
        /// </summary>
        public readonly ImmutableArray<string> EventTypeLists;
        /// <summary>
        /// The level of the event-triggered alert rule. Valid values:
        /// - `CRITICAL`: critical.
        /// - `WARN`: warning.
        /// - `INFO`: information.
        /// - `*`: all types.
        /// </summary>
        public readonly ImmutableArray<string> LevelLists;
        /// <summary>
        /// The name of the event-triggered alert rule.
        /// </summary>
        public readonly ImmutableArray<string> NameLists;
        /// <summary>
        /// The type of the cloud service.
        /// </summary>
        public readonly string Product;
        /// <summary>
        /// The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.
        /// </summary>
        public readonly string? SqlFilter;

        [OutputConstructor]
        private EventRuleEventPattern(
            ImmutableArray<string> eventTypeLists,

            ImmutableArray<string> levelLists,

            ImmutableArray<string> nameLists,

            string product,

            string? sqlFilter)
        {
            EventTypeLists = eventTypeLists;
            LevelLists = levelLists;
            NameLists = nameLists;
            Product = product;
            SqlFilter = sqlFilter;
        }
    }
}
