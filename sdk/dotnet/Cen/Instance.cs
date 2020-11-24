// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// Provides a CEN instance resource. Cloud Enterprise Network (CEN) is a service that allows you to create a global network for rapidly building a distributed business system with a hybrid cloud computing solution. CEN enables you to build a secure, private, and enterprise-class interconnected network between VPCs in different regions and your local data centers. CEN provides enterprise-class scalability that automatically responds to your dynamic computing requirements.
    /// 
    /// For information about CEN and how to use it, see [What is Cloud Enterprise Network](https://www.alibabacloud.com/help/doc-detail/59870.htm).
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
    ///         var example = new AliCloud.Cen.Instance("example", new AliCloud.Cen.InstanceArgs
    ///         {
    ///             CenInstanceName = "tf_test_foo",
    ///             Description = "an example for cen",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// CEN instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/instance:Instance example cen-abc123456
    /// ```
    /// </summary>
    public partial class Instance : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the CEN instance. Defaults to null. The name must be 2 to 128 characters in length and can contain letters, numbers, periods (.), underscores (_), and hyphens (-). The name must start with a letter, but cannot start with http:// or https://.
        /// </summary>
        [Output("cenInstanceName")]
        public Output<string> CenInstanceName { get; private set; } = null!;

        /// <summary>
        /// The description of the CEN instance. Defaults to null. The description must be 2 to 256 characters in length. It must start with a letter, and cannot start with http:// or https://.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Field `name` has been deprecated from version 1.98.0. Use `cen_instance_name` instead.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates the allowed level of CIDR block overlapping. Default value: `REDUCE`: Overlapping CIDR blocks are allowed. However, the overlapping CIDR blocks cannot be identical.
        /// </summary>
        [Output("protectionLevel")]
        public Output<string?> ProtectionLevel { get; private set; } = null!;

        /// <summary>
        /// The Cen Instance current status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the CEN instance. Defaults to null. The name must be 2 to 128 characters in length and can contain letters, numbers, periods (.), underscores (_), and hyphens (-). The name must start with a letter, but cannot start with http:// or https://.
        /// </summary>
        [Input("cenInstanceName")]
        public Input<string>? CenInstanceName { get; set; }

        /// <summary>
        /// The description of the CEN instance. Defaults to null. The description must be 2 to 256 characters in length. It must start with a letter, and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field `name` has been deprecated from version 1.98.0. Use `cen_instance_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the allowed level of CIDR block overlapping. Default value: `REDUCE`: Overlapping CIDR blocks are allowed. However, the overlapping CIDR blocks cannot be identical.
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the CEN instance. Defaults to null. The name must be 2 to 128 characters in length and can contain letters, numbers, periods (.), underscores (_), and hyphens (-). The name must start with a letter, but cannot start with http:// or https://.
        /// </summary>
        [Input("cenInstanceName")]
        public Input<string>? CenInstanceName { get; set; }

        /// <summary>
        /// The description of the CEN instance. Defaults to null. The description must be 2 to 256 characters in length. It must start with a letter, and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field `name` has been deprecated from version 1.98.0. Use `cen_instance_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates the allowed level of CIDR block overlapping. Default value: `REDUCE`: Overlapping CIDR blocks are allowed. However, the overlapping CIDR blocks cannot be identical.
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        /// <summary>
        /// The Cen Instance current status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public InstanceState()
        {
        }
    }
}
