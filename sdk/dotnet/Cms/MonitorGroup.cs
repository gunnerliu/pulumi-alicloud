// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    /// <summary>
    /// Provides a Cloud Monitor Service Monitor Group resource.
    /// 
    /// For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/doc-detail/115030.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.113.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new AliCloud.Cms.MonitorGroup("example", new AliCloud.Cms.MonitorGroupArgs
    ///         {
    ///             MonitorGroupName = "tf-testaccmonitorgroup",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Monitor Service Monitor Group can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cms/monitorGroup:MonitorGroup example &lt;id&gt;
    /// ```
    /// </summary>
    public partial class MonitorGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// The alert group to which alert notifications will be sent.
        /// </summary>
        [Output("contactGroups")]
        public Output<ImmutableArray<string>> ContactGroups { get; private set; } = null!;

        /// <summary>
        /// The name of the application group.
        /// </summary>
        [Output("monitorGroupName")]
        public Output<string> MonitorGroupName { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a MonitorGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitorGroup(string name, MonitorGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cms/monitorGroup:MonitorGroup", name, args ?? new MonitorGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MonitorGroup(string name, Input<string> id, MonitorGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cms/monitorGroup:MonitorGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MonitorGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitorGroup Get(string name, Input<string> id, MonitorGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitorGroup(name, id, state, options);
        }
    }

    public sealed class MonitorGroupArgs : Pulumi.ResourceArgs
    {
        [Input("contactGroups")]
        private InputList<string>? _contactGroups;

        /// <summary>
        /// The alert group to which alert notifications will be sent.
        /// </summary>
        public InputList<string> ContactGroups
        {
            get => _contactGroups ?? (_contactGroups = new InputList<string>());
            set => _contactGroups = value;
        }

        /// <summary>
        /// The name of the application group.
        /// </summary>
        [Input("monitorGroupName", required: true)]
        public Input<string> MonitorGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public MonitorGroupArgs()
        {
        }
    }

    public sealed class MonitorGroupState : Pulumi.ResourceArgs
    {
        [Input("contactGroups")]
        private InputList<string>? _contactGroups;

        /// <summary>
        /// The alert group to which alert notifications will be sent.
        /// </summary>
        public InputList<string> ContactGroups
        {
            get => _contactGroups ?? (_contactGroups = new InputList<string>());
            set => _contactGroups = value;
        }

        /// <summary>
        /// The name of the application group.
        /// </summary>
        [Input("monitorGroupName")]
        public Input<string>? MonitorGroupName { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public MonitorGroupState()
        {
        }
    }
}
