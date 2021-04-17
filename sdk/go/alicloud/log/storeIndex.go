// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Log store index can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:log/storeIndex:StoreIndex example tf-log:tf-log-store
// ```
type StoreIndex struct {
	pulumi.CustomResourceState

	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayOutput `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrOutput `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore pulumi.StringOutput `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewStoreIndex registers a new resource with the given unique name, arguments, and options.
func NewStoreIndex(ctx *pulumi.Context,
	name string, args *StoreIndexArgs, opts ...pulumi.ResourceOption) (*StoreIndex, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Logstore == nil {
		return nil, errors.New("invalid value for required argument 'Logstore'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	var resource StoreIndex
	err := ctx.RegisterResource("alicloud:log/storeIndex:StoreIndex", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStoreIndex gets an existing StoreIndex resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStoreIndex(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StoreIndexState, opts ...pulumi.ResourceOption) (*StoreIndex, error) {
	var resource StoreIndex
	err := ctx.ReadResource("alicloud:log/storeIndex:StoreIndex", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StoreIndex resources.
type storeIndexState struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches []StoreIndexFieldSearch `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText *StoreIndexFullText `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore *string `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project *string `pulumi:"project"`
}

type StoreIndexState struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayInput
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrInput
	// The log store name to the query index belongs.
	Logstore pulumi.StringPtrInput
	// The project name to the log store belongs.
	Project pulumi.StringPtrInput
}

func (StoreIndexState) ElementType() reflect.Type {
	return reflect.TypeOf((*storeIndexState)(nil)).Elem()
}

type storeIndexArgs struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches []StoreIndexFieldSearch `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText *StoreIndexFullText `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore string `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project string `pulumi:"project"`
}

// The set of arguments for constructing a StoreIndex resource.
type StoreIndexArgs struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayInput
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrInput
	// The log store name to the query index belongs.
	Logstore pulumi.StringInput
	// The project name to the log store belongs.
	Project pulumi.StringInput
}

func (StoreIndexArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storeIndexArgs)(nil)).Elem()
}

type StoreIndexInput interface {
	pulumi.Input

	ToStoreIndexOutput() StoreIndexOutput
	ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput
}

func (*StoreIndex) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndex)(nil))
}

func (i *StoreIndex) ToStoreIndexOutput() StoreIndexOutput {
	return i.ToStoreIndexOutputWithContext(context.Background())
}

func (i *StoreIndex) ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexOutput)
}

func (i *StoreIndex) ToStoreIndexPtrOutput() StoreIndexPtrOutput {
	return i.ToStoreIndexPtrOutputWithContext(context.Background())
}

func (i *StoreIndex) ToStoreIndexPtrOutputWithContext(ctx context.Context) StoreIndexPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexPtrOutput)
}

type StoreIndexPtrInput interface {
	pulumi.Input

	ToStoreIndexPtrOutput() StoreIndexPtrOutput
	ToStoreIndexPtrOutputWithContext(ctx context.Context) StoreIndexPtrOutput
}

type storeIndexPtrType StoreIndexArgs

func (*storeIndexPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndex)(nil))
}

func (i *storeIndexPtrType) ToStoreIndexPtrOutput() StoreIndexPtrOutput {
	return i.ToStoreIndexPtrOutputWithContext(context.Background())
}

func (i *storeIndexPtrType) ToStoreIndexPtrOutputWithContext(ctx context.Context) StoreIndexPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexPtrOutput)
}

// StoreIndexArrayInput is an input type that accepts StoreIndexArray and StoreIndexArrayOutput values.
// You can construct a concrete instance of `StoreIndexArrayInput` via:
//
//          StoreIndexArray{ StoreIndexArgs{...} }
type StoreIndexArrayInput interface {
	pulumi.Input

	ToStoreIndexArrayOutput() StoreIndexArrayOutput
	ToStoreIndexArrayOutputWithContext(context.Context) StoreIndexArrayOutput
}

type StoreIndexArray []StoreIndexInput

func (StoreIndexArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*StoreIndex)(nil))
}

func (i StoreIndexArray) ToStoreIndexArrayOutput() StoreIndexArrayOutput {
	return i.ToStoreIndexArrayOutputWithContext(context.Background())
}

func (i StoreIndexArray) ToStoreIndexArrayOutputWithContext(ctx context.Context) StoreIndexArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexArrayOutput)
}

// StoreIndexMapInput is an input type that accepts StoreIndexMap and StoreIndexMapOutput values.
// You can construct a concrete instance of `StoreIndexMapInput` via:
//
//          StoreIndexMap{ "key": StoreIndexArgs{...} }
type StoreIndexMapInput interface {
	pulumi.Input

	ToStoreIndexMapOutput() StoreIndexMapOutput
	ToStoreIndexMapOutputWithContext(context.Context) StoreIndexMapOutput
}

type StoreIndexMap map[string]StoreIndexInput

func (StoreIndexMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*StoreIndex)(nil))
}

func (i StoreIndexMap) ToStoreIndexMapOutput() StoreIndexMapOutput {
	return i.ToStoreIndexMapOutputWithContext(context.Background())
}

func (i StoreIndexMap) ToStoreIndexMapOutputWithContext(ctx context.Context) StoreIndexMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexMapOutput)
}

type StoreIndexOutput struct {
	*pulumi.OutputState
}

func (StoreIndexOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIndex)(nil))
}

func (o StoreIndexOutput) ToStoreIndexOutput() StoreIndexOutput {
	return o
}

func (o StoreIndexOutput) ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput {
	return o
}

func (o StoreIndexOutput) ToStoreIndexPtrOutput() StoreIndexPtrOutput {
	return o.ToStoreIndexPtrOutputWithContext(context.Background())
}

func (o StoreIndexOutput) ToStoreIndexPtrOutputWithContext(ctx context.Context) StoreIndexPtrOutput {
	return o.ApplyT(func(v StoreIndex) *StoreIndex {
		return &v
	}).(StoreIndexPtrOutput)
}

type StoreIndexPtrOutput struct {
	*pulumi.OutputState
}

func (StoreIndexPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndex)(nil))
}

func (o StoreIndexPtrOutput) ToStoreIndexPtrOutput() StoreIndexPtrOutput {
	return o
}

func (o StoreIndexPtrOutput) ToStoreIndexPtrOutputWithContext(ctx context.Context) StoreIndexPtrOutput {
	return o
}

type StoreIndexArrayOutput struct{ *pulumi.OutputState }

func (StoreIndexArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StoreIndex)(nil))
}

func (o StoreIndexArrayOutput) ToStoreIndexArrayOutput() StoreIndexArrayOutput {
	return o
}

func (o StoreIndexArrayOutput) ToStoreIndexArrayOutputWithContext(ctx context.Context) StoreIndexArrayOutput {
	return o
}

func (o StoreIndexArrayOutput) Index(i pulumi.IntInput) StoreIndexOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) StoreIndex {
		return vs[0].([]StoreIndex)[vs[1].(int)]
	}).(StoreIndexOutput)
}

type StoreIndexMapOutput struct{ *pulumi.OutputState }

func (StoreIndexMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]StoreIndex)(nil))
}

func (o StoreIndexMapOutput) ToStoreIndexMapOutput() StoreIndexMapOutput {
	return o
}

func (o StoreIndexMapOutput) ToStoreIndexMapOutputWithContext(ctx context.Context) StoreIndexMapOutput {
	return o
}

func (o StoreIndexMapOutput) MapIndex(k pulumi.StringInput) StoreIndexOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) StoreIndex {
		return vs[0].(map[string]StoreIndex)[vs[1].(string)]
	}).(StoreIndexOutput)
}

func init() {
	pulumi.RegisterOutputType(StoreIndexOutput{})
	pulumi.RegisterOutputType(StoreIndexPtrOutput{})
	pulumi.RegisterOutputType(StoreIndexArrayOutput{})
	pulumi.RegisterOutputType(StoreIndexMapOutput{})
}
