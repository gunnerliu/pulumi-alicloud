// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Outputs
{

    [OutputType]
    public sealed class TablePrimaryKey
    {
        /// <summary>
        /// Name for defined column.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Type for defined column. `Integer`, `String`, `Binary`, `Double`, `Boolean` is allowed.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private TablePrimaryKey(
            string name,

            string type)
        {
            Name = name;
            Type = type;
        }
    }
}
