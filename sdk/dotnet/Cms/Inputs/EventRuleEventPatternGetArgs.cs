// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class EventRuleEventPatternGetArgs : Pulumi.ResourceArgs
    {
        [Input("eventTypeLists")]
        private InputList<string>? _eventTypeLists;

        /// <summary>
        /// The type of the event-triggered alert rule. Valid values:
        /// - `StatusNotification`: fault notifications.
        /// - `Exception`: exceptions.
        /// - `Maintenance`: O&amp;M.
        /// - `*`: all types.
        /// </summary>
        public InputList<string> EventTypeLists
        {
            get => _eventTypeLists ?? (_eventTypeLists = new InputList<string>());
            set => _eventTypeLists = value;
        }

        [Input("levelLists")]
        private InputList<string>? _levelLists;

        /// <summary>
        /// The level of the event-triggered alert rule. Valid values:
        /// - `CRITICAL`: critical.
        /// - `WARN`: warning.
        /// - `INFO`: information.
        /// - `*`: all types.
        /// </summary>
        public InputList<string> LevelLists
        {
            get => _levelLists ?? (_levelLists = new InputList<string>());
            set => _levelLists = value;
        }

        [Input("nameLists")]
        private InputList<string>? _nameLists;

        /// <summary>
        /// The name of the event-triggered alert rule.
        /// </summary>
        public InputList<string> NameLists
        {
            get => _nameLists ?? (_nameLists = new InputList<string>());
            set => _nameLists = value;
        }

        /// <summary>
        /// The type of the cloud service.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.
        /// </summary>
        [Input("sqlFilter")]
        public Input<string>? SqlFilter { get; set; }

        public EventRuleEventPatternGetArgs()
        {
        }
    }
}
