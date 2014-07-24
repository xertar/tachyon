/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PartitionSortedStorePartitionInfo implements org.apache.thrift.TBase<PartitionSortedStorePartitionInfo, PartitionSortedStorePartitionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionSortedStorePartitionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionSortedStorePartitionInfo");

  private static final org.apache.thrift.protocol.TField STORE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("storeType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storeId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionIndex", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_FILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataFileId", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField INDEX_FILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("indexFileId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("startKey", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField END_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("endKey", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionSortedStorePartitionInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionSortedStorePartitionInfoTupleSchemeFactory());
  }

  public String storeType; // required
  public int storeId; // required
  public int partitionIndex; // required
  public int dataFileId; // required
  public int indexFileId; // required
  public ByteBuffer startKey; // required
  public ByteBuffer endKey; // required
  public NetAddress location; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORE_TYPE((short)1, "storeType"),
    STORE_ID((short)2, "storeId"),
    PARTITION_INDEX((short)3, "partitionIndex"),
    DATA_FILE_ID((short)4, "dataFileId"),
    INDEX_FILE_ID((short)5, "indexFileId"),
    START_KEY((short)6, "startKey"),
    END_KEY((short)7, "endKey"),
    LOCATION((short)8, "location");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STORE_TYPE
          return STORE_TYPE;
        case 2: // STORE_ID
          return STORE_ID;
        case 3: // PARTITION_INDEX
          return PARTITION_INDEX;
        case 4: // DATA_FILE_ID
          return DATA_FILE_ID;
        case 5: // INDEX_FILE_ID
          return INDEX_FILE_ID;
        case 6: // START_KEY
          return START_KEY;
        case 7: // END_KEY
          return END_KEY;
        case 8: // LOCATION
          return LOCATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STOREID_ISSET_ID = 0;
  private static final int __PARTITIONINDEX_ISSET_ID = 1;
  private static final int __DATAFILEID_ISSET_ID = 2;
  private static final int __INDEXFILEID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("storeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STORE_ID, new org.apache.thrift.meta_data.FieldMetaData("storeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARTITION_INDEX, new org.apache.thrift.meta_data.FieldMetaData("partitionIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA_FILE_ID, new org.apache.thrift.meta_data.FieldMetaData("dataFileId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INDEX_FILE_ID, new org.apache.thrift.meta_data.FieldMetaData("indexFileId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_KEY, new org.apache.thrift.meta_data.FieldMetaData("startKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.END_KEY, new org.apache.thrift.meta_data.FieldMetaData("endKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NetAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionSortedStorePartitionInfo.class, metaDataMap);
  }

  public PartitionSortedStorePartitionInfo() {
  }

  public PartitionSortedStorePartitionInfo(
    String storeType,
    int storeId,
    int partitionIndex,
    int dataFileId,
    int indexFileId,
    ByteBuffer startKey,
    ByteBuffer endKey,
    NetAddress location)
  {
    this();
    this.storeType = storeType;
    this.storeId = storeId;
    setStoreIdIsSet(true);
    this.partitionIndex = partitionIndex;
    setPartitionIndexIsSet(true);
    this.dataFileId = dataFileId;
    setDataFileIdIsSet(true);
    this.indexFileId = indexFileId;
    setIndexFileIdIsSet(true);
    this.startKey = startKey;
    this.endKey = endKey;
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionSortedStorePartitionInfo(PartitionSortedStorePartitionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStoreType()) {
      this.storeType = other.storeType;
    }
    this.storeId = other.storeId;
    this.partitionIndex = other.partitionIndex;
    this.dataFileId = other.dataFileId;
    this.indexFileId = other.indexFileId;
    if (other.isSetStartKey()) {
      this.startKey = org.apache.thrift.TBaseHelper.copyBinary(other.startKey);
;
    }
    if (other.isSetEndKey()) {
      this.endKey = org.apache.thrift.TBaseHelper.copyBinary(other.endKey);
;
    }
    if (other.isSetLocation()) {
      this.location = new NetAddress(other.location);
    }
  }

  public PartitionSortedStorePartitionInfo deepCopy() {
    return new PartitionSortedStorePartitionInfo(this);
  }

  @Override
  public void clear() {
    this.storeType = null;
    setStoreIdIsSet(false);
    this.storeId = 0;
    setPartitionIndexIsSet(false);
    this.partitionIndex = 0;
    setDataFileIdIsSet(false);
    this.dataFileId = 0;
    setIndexFileIdIsSet(false);
    this.indexFileId = 0;
    this.startKey = null;
    this.endKey = null;
    this.location = null;
  }

  public String getStoreType() {
    return this.storeType;
  }

  public PartitionSortedStorePartitionInfo setStoreType(String storeType) {
    this.storeType = storeType;
    return this;
  }

  public void unsetStoreType() {
    this.storeType = null;
  }

  /** Returns true if field storeType is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreType() {
    return this.storeType != null;
  }

  public void setStoreTypeIsSet(boolean value) {
    if (!value) {
      this.storeType = null;
    }
  }

  public int getStoreId() {
    return this.storeId;
  }

  public PartitionSortedStorePartitionInfo setStoreId(int storeId) {
    this.storeId = storeId;
    setStoreIdIsSet(true);
    return this;
  }

  public void unsetStoreId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  /** Returns true if field storeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreId() {
    return EncodingUtils.testBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  public void setStoreIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STOREID_ISSET_ID, value);
  }

  public int getPartitionIndex() {
    return this.partitionIndex;
  }

  public PartitionSortedStorePartitionInfo setPartitionIndex(int partitionIndex) {
    this.partitionIndex = partitionIndex;
    setPartitionIndexIsSet(true);
    return this;
  }

  public void unsetPartitionIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONINDEX_ISSET_ID);
  }

  /** Returns true if field partitionIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONINDEX_ISSET_ID);
  }

  public void setPartitionIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONINDEX_ISSET_ID, value);
  }

  public int getDataFileId() {
    return this.dataFileId;
  }

  public PartitionSortedStorePartitionInfo setDataFileId(int dataFileId) {
    this.dataFileId = dataFileId;
    setDataFileIdIsSet(true);
    return this;
  }

  public void unsetDataFileId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATAFILEID_ISSET_ID);
  }

  /** Returns true if field dataFileId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataFileId() {
    return EncodingUtils.testBit(__isset_bitfield, __DATAFILEID_ISSET_ID);
  }

  public void setDataFileIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATAFILEID_ISSET_ID, value);
  }

  public int getIndexFileId() {
    return this.indexFileId;
  }

  public PartitionSortedStorePartitionInfo setIndexFileId(int indexFileId) {
    this.indexFileId = indexFileId;
    setIndexFileIdIsSet(true);
    return this;
  }

  public void unsetIndexFileId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEXFILEID_ISSET_ID);
  }

  /** Returns true if field indexFileId is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexFileId() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEXFILEID_ISSET_ID);
  }

  public void setIndexFileIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEXFILEID_ISSET_ID, value);
  }

  public byte[] getStartKey() {
    setStartKey(org.apache.thrift.TBaseHelper.rightSize(startKey));
    return startKey == null ? null : startKey.array();
  }

  public ByteBuffer bufferForStartKey() {
    return startKey;
  }

  public PartitionSortedStorePartitionInfo setStartKey(byte[] startKey) {
    setStartKey(startKey == null ? (ByteBuffer)null : ByteBuffer.wrap(startKey));
    return this;
  }

  public PartitionSortedStorePartitionInfo setStartKey(ByteBuffer startKey) {
    this.startKey = startKey;
    return this;
  }

  public void unsetStartKey() {
    this.startKey = null;
  }

  /** Returns true if field startKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.startKey != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.startKey = null;
    }
  }

  public byte[] getEndKey() {
    setEndKey(org.apache.thrift.TBaseHelper.rightSize(endKey));
    return endKey == null ? null : endKey.array();
  }

  public ByteBuffer bufferForEndKey() {
    return endKey;
  }

  public PartitionSortedStorePartitionInfo setEndKey(byte[] endKey) {
    setEndKey(endKey == null ? (ByteBuffer)null : ByteBuffer.wrap(endKey));
    return this;
  }

  public PartitionSortedStorePartitionInfo setEndKey(ByteBuffer endKey) {
    this.endKey = endKey;
    return this;
  }

  public void unsetEndKey() {
    this.endKey = null;
  }

  /** Returns true if field endKey is set (has been assigned a value) and false otherwise */
  public boolean isSetEndKey() {
    return this.endKey != null;
  }

  public void setEndKeyIsSet(boolean value) {
    if (!value) {
      this.endKey = null;
    }
  }

  public NetAddress getLocation() {
    return this.location;
  }

  public PartitionSortedStorePartitionInfo setLocation(NetAddress location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORE_TYPE:
      if (value == null) {
        unsetStoreType();
      } else {
        setStoreType((String)value);
      }
      break;

    case STORE_ID:
      if (value == null) {
        unsetStoreId();
      } else {
        setStoreId((Integer)value);
      }
      break;

    case PARTITION_INDEX:
      if (value == null) {
        unsetPartitionIndex();
      } else {
        setPartitionIndex((Integer)value);
      }
      break;

    case DATA_FILE_ID:
      if (value == null) {
        unsetDataFileId();
      } else {
        setDataFileId((Integer)value);
      }
      break;

    case INDEX_FILE_ID:
      if (value == null) {
        unsetIndexFileId();
      } else {
        setIndexFileId((Integer)value);
      }
      break;

    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        setStartKey((ByteBuffer)value);
      }
      break;

    case END_KEY:
      if (value == null) {
        unsetEndKey();
      } else {
        setEndKey((ByteBuffer)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((NetAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORE_TYPE:
      return getStoreType();

    case STORE_ID:
      return Integer.valueOf(getStoreId());

    case PARTITION_INDEX:
      return Integer.valueOf(getPartitionIndex());

    case DATA_FILE_ID:
      return Integer.valueOf(getDataFileId());

    case INDEX_FILE_ID:
      return Integer.valueOf(getIndexFileId());

    case START_KEY:
      return getStartKey();

    case END_KEY:
      return getEndKey();

    case LOCATION:
      return getLocation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORE_TYPE:
      return isSetStoreType();
    case STORE_ID:
      return isSetStoreId();
    case PARTITION_INDEX:
      return isSetPartitionIndex();
    case DATA_FILE_ID:
      return isSetDataFileId();
    case INDEX_FILE_ID:
      return isSetIndexFileId();
    case START_KEY:
      return isSetStartKey();
    case END_KEY:
      return isSetEndKey();
    case LOCATION:
      return isSetLocation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionSortedStorePartitionInfo)
      return this.equals((PartitionSortedStorePartitionInfo)that);
    return false;
  }

  public boolean equals(PartitionSortedStorePartitionInfo that) {
    if (that == null)
      return false;

    boolean this_present_storeType = true && this.isSetStoreType();
    boolean that_present_storeType = true && that.isSetStoreType();
    if (this_present_storeType || that_present_storeType) {
      if (!(this_present_storeType && that_present_storeType))
        return false;
      if (!this.storeType.equals(that.storeType))
        return false;
    }

    boolean this_present_storeId = true;
    boolean that_present_storeId = true;
    if (this_present_storeId || that_present_storeId) {
      if (!(this_present_storeId && that_present_storeId))
        return false;
      if (this.storeId != that.storeId)
        return false;
    }

    boolean this_present_partitionIndex = true;
    boolean that_present_partitionIndex = true;
    if (this_present_partitionIndex || that_present_partitionIndex) {
      if (!(this_present_partitionIndex && that_present_partitionIndex))
        return false;
      if (this.partitionIndex != that.partitionIndex)
        return false;
    }

    boolean this_present_dataFileId = true;
    boolean that_present_dataFileId = true;
    if (this_present_dataFileId || that_present_dataFileId) {
      if (!(this_present_dataFileId && that_present_dataFileId))
        return false;
      if (this.dataFileId != that.dataFileId)
        return false;
    }

    boolean this_present_indexFileId = true;
    boolean that_present_indexFileId = true;
    if (this_present_indexFileId || that_present_indexFileId) {
      if (!(this_present_indexFileId && that_present_indexFileId))
        return false;
      if (this.indexFileId != that.indexFileId)
        return false;
    }

    boolean this_present_startKey = true && this.isSetStartKey();
    boolean that_present_startKey = true && that.isSetStartKey();
    if (this_present_startKey || that_present_startKey) {
      if (!(this_present_startKey && that_present_startKey))
        return false;
      if (!this.startKey.equals(that.startKey))
        return false;
    }

    boolean this_present_endKey = true && this.isSetEndKey();
    boolean that_present_endKey = true && that.isSetEndKey();
    if (this_present_endKey || that_present_endKey) {
      if (!(this_present_endKey && that_present_endKey))
        return false;
      if (!this.endKey.equals(that.endKey))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PartitionSortedStorePartitionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStoreType()).compareTo(other.isSetStoreType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeType, other.storeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStoreId()).compareTo(other.isSetStoreId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeId, other.storeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionIndex()).compareTo(other.isSetPartitionIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionIndex, other.partitionIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataFileId()).compareTo(other.isSetDataFileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataFileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataFileId, other.dataFileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndexFileId()).compareTo(other.isSetIndexFileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexFileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexFileId, other.indexFileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartKey()).compareTo(other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startKey, other.startKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndKey()).compareTo(other.isSetEndKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endKey, other.endKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PartitionSortedStorePartitionInfo(");
    boolean first = true;

    sb.append("storeType:");
    if (this.storeType == null) {
      sb.append("null");
    } else {
      sb.append(this.storeType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storeId:");
    sb.append(this.storeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitionIndex:");
    sb.append(this.partitionIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataFileId:");
    sb.append(this.dataFileId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("indexFileId:");
    sb.append(this.indexFileId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startKey:");
    if (this.startKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.startKey, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endKey:");
    if (this.endKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.endKey, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (location != null) {
      location.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionSortedStorePartitionInfoStandardSchemeFactory implements SchemeFactory {
    public PartitionSortedStorePartitionInfoStandardScheme getScheme() {
      return new PartitionSortedStorePartitionInfoStandardScheme();
    }
  }

  private static class PartitionSortedStorePartitionInfoStandardScheme extends StandardScheme<PartitionSortedStorePartitionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionSortedStorePartitionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storeType = iprot.readString();
              struct.setStoreTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STORE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.storeId = iprot.readI32();
              struct.setStoreIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.partitionIndex = iprot.readI32();
              struct.setPartitionIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_FILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dataFileId = iprot.readI32();
              struct.setDataFileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INDEX_FILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.indexFileId = iprot.readI32();
              struct.setIndexFileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startKey = iprot.readBinary();
              struct.setStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // END_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endKey = iprot.readBinary();
              struct.setEndKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.location = new NetAddress();
              struct.location.read(iprot);
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionSortedStorePartitionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storeType != null) {
        oprot.writeFieldBegin(STORE_TYPE_FIELD_DESC);
        oprot.writeString(struct.storeType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STORE_ID_FIELD_DESC);
      oprot.writeI32(struct.storeId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PARTITION_INDEX_FIELD_DESC);
      oprot.writeI32(struct.partitionIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_FILE_ID_FIELD_DESC);
      oprot.writeI32(struct.dataFileId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INDEX_FILE_ID_FIELD_DESC);
      oprot.writeI32(struct.indexFileId);
      oprot.writeFieldEnd();
      if (struct.startKey != null) {
        oprot.writeFieldBegin(START_KEY_FIELD_DESC);
        oprot.writeBinary(struct.startKey);
        oprot.writeFieldEnd();
      }
      if (struct.endKey != null) {
        oprot.writeFieldBegin(END_KEY_FIELD_DESC);
        oprot.writeBinary(struct.endKey);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        struct.location.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionSortedStorePartitionInfoTupleSchemeFactory implements SchemeFactory {
    public PartitionSortedStorePartitionInfoTupleScheme getScheme() {
      return new PartitionSortedStorePartitionInfoTupleScheme();
    }
  }

  private static class PartitionSortedStorePartitionInfoTupleScheme extends TupleScheme<PartitionSortedStorePartitionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionSortedStorePartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStoreType()) {
        optionals.set(0);
      }
      if (struct.isSetStoreId()) {
        optionals.set(1);
      }
      if (struct.isSetPartitionIndex()) {
        optionals.set(2);
      }
      if (struct.isSetDataFileId()) {
        optionals.set(3);
      }
      if (struct.isSetIndexFileId()) {
        optionals.set(4);
      }
      if (struct.isSetStartKey()) {
        optionals.set(5);
      }
      if (struct.isSetEndKey()) {
        optionals.set(6);
      }
      if (struct.isSetLocation()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetStoreType()) {
        oprot.writeString(struct.storeType);
      }
      if (struct.isSetStoreId()) {
        oprot.writeI32(struct.storeId);
      }
      if (struct.isSetPartitionIndex()) {
        oprot.writeI32(struct.partitionIndex);
      }
      if (struct.isSetDataFileId()) {
        oprot.writeI32(struct.dataFileId);
      }
      if (struct.isSetIndexFileId()) {
        oprot.writeI32(struct.indexFileId);
      }
      if (struct.isSetStartKey()) {
        oprot.writeBinary(struct.startKey);
      }
      if (struct.isSetEndKey()) {
        oprot.writeBinary(struct.endKey);
      }
      if (struct.isSetLocation()) {
        struct.location.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionSortedStorePartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.storeType = iprot.readString();
        struct.setStoreTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.storeId = iprot.readI32();
        struct.setStoreIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.partitionIndex = iprot.readI32();
        struct.setPartitionIndexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dataFileId = iprot.readI32();
        struct.setDataFileIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.indexFileId = iprot.readI32();
        struct.setIndexFileIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.startKey = iprot.readBinary();
        struct.setStartKeyIsSet(true);
      }
      if (incoming.get(6)) {
        struct.endKey = iprot.readBinary();
        struct.setEndKeyIsSet(true);
      }
      if (incoming.get(7)) {
        struct.location = new NetAddress();
        struct.location.read(iprot);
        struct.setLocationIsSet(true);
      }
    }
  }

}
