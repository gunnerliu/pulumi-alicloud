// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Operate the public network ip of the specified resource. How to use it, see [What is Resource Alicloud KVStore Connection](https://www.alibabacloud.com/help/doc-detail/125795.htm).
//
// > **NOTE:** Available in v1.101.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/kvstore"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := kvstore.NewConnection(ctx, "_default", &kvstore.ConnectionArgs{
// 			ConnectionStringPrefix: pulumi.String("allocatetestupdate"),
// 			InstanceId:             pulumi.String("r-abc123456"),
// 			Port:                   pulumi.String("6370"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Connection struct {
	pulumi.CustomResourceState

	// The public connection string of KVStore DBInstance.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
	ConnectionStringPrefix pulumi.StringOutput `pulumi:"connectionStringPrefix"`
	// The ID of the instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The service port number of the instance.
	Port pulumi.StringOutput `pulumi:"port"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil || args.ConnectionStringPrefix == nil {
		return nil, errors.New("missing required argument 'ConnectionStringPrefix'")
	}
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil || args.Port == nil {
		return nil, errors.New("missing required argument 'Port'")
	}
	if args == nil {
		args = &ConnectionArgs{}
	}
	var resource Connection
	err := ctx.RegisterResource("alicloud:kvstore/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("alicloud:kvstore/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// The public connection string of KVStore DBInstance.
	ConnectionString *string `pulumi:"connectionString"`
	// The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
	ConnectionStringPrefix *string `pulumi:"connectionStringPrefix"`
	// The ID of the instance.
	InstanceId *string `pulumi:"instanceId"`
	// The service port number of the instance.
	Port *string `pulumi:"port"`
}

type ConnectionState struct {
	// The public connection string of KVStore DBInstance.
	ConnectionString pulumi.StringPtrInput
	// The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
	ConnectionStringPrefix pulumi.StringPtrInput
	// The ID of the instance.
	InstanceId pulumi.StringPtrInput
	// The service port number of the instance.
	Port pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
	ConnectionStringPrefix string `pulumi:"connectionStringPrefix"`
	// The ID of the instance.
	InstanceId string `pulumi:"instanceId"`
	// The service port number of the instance.
	Port string `pulumi:"port"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// The prefix of the public endpoint. The prefix can be 8 to 64 characters in length, and can contain lowercase letters and digits. It must start with a lowercase letter.
	ConnectionStringPrefix pulumi.StringInput
	// The ID of the instance.
	InstanceId pulumi.StringInput
	// The service port number of the instance.
	Port pulumi.StringInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}
